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
    const schedules = [];
    
    let value = 'A';
    for(let i = 0; i < 2; i++){
        const M = +readln();

        const live = {};
        for(let i = 0; i < M; i++){
            const day = +readln();
            live[day-1] = value;
        }
        schedules.push(live);
        value = 'B';
    }

    const [as, bs] = schedules;
    let gotoA = true;
    for(let i = 0; i < 31; i++){

        let current;
        if(as[i] != undefined && bs[i] != undefined){
            current = (gotoA)?'A':'B';
            gotoA = !gotoA;
        }else{
            current = as[i] ?? bs[i] ?? 'x';
        }

        console.log(current);
    }
});