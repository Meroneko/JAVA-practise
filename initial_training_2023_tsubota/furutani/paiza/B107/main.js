let lines = [];

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
    let [n, m, k] = readln().split(" ").map(Number);

    list = [];
    for (let i = 0; i < n; i++) {
        list.push(i+1);
    }

    let setAmount = Math.ceil(n/m);
    let setStart = 0;
    let setEnd = 0;
    let tmpList = [];

    for (let i = 0; i < k; i++) {
        //各セット
        for (let j = 0; j < setAmount; j++){
            setStart = m * j;
            setEnd = (setStart + m) < n ? setStart + m : n;

            const shuffleSet = list.slice(setStart, setEnd);

            tmpList.unshift(...shuffleSet);
        }
        list = tmpList;
        tmpList = [];
    }

    for(let card of list){
        console.log(card);
    }
});
