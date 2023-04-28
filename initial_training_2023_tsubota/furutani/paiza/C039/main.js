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
    let s = readln();

    let ten, one;
    ten = one = 0;
    for(var c of s){
        switch(c){
            case '<':   ten++;  break;
            case '/':   one++;  break;
        }
    }

    console.log(ten*10+one);
});