const lines = [];

class InputPointer{
    constructor(){
        this.count = 0;
        this.next = () => lines[this.count++];
    }
}

const readln = new InputPointer().next;

process.stdin.resume();
process.stdin.setEncoding('utf8');

var reader = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

reader.on('line', (line) => {
  lines.push(line);
});

// ↑ 入力 前準備
// ↓ 問題の処理内容
reader.on('close', () => {
    const [H, W, N] = readln().split(" ").map(Number);

    const students = [];
    
    //入力, くじ順ソート
    let lottery;
    for(let i = 0; i < N; i++){
        lottery = Number(readln())-1;
        students.push([lottery, i]);
    }
    students.sort((a, b) => a[0] - b[0]);

    //椅子に配置
    const chairs = [];
    const countPerColumn = new Array(W).fill(0);
    let currentStudent, currentIndex = 0;

    for(let i = 0; i < H; i++){
        chairs.push(new Array(W).fill(0));
        for(let j = 0; j < W; j++){
            if(currentIndex >= N) break;

            //くじ番号と等しい席から詰めて配置
            ([lottery, currentStudent] = students[currentIndex]);
            if(lottery == i*W+j){
                chairs[countPerColumn[j]++][j] = currentStudent+1;
                currentIndex++;
            }
        }
    }

    //出力
    for(let row of chairs){
        console.log(row.join(" "));
    }
});