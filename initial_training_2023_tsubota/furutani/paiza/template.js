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
});