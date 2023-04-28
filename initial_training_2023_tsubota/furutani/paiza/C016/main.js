let lines = [];

class Pointer{
    constructor(){ this.count = 0;}
    next(){ return lines[this.count++];}
}

p = new Pointer();

process.stdin.resume();
process.stdin.setEncoding('utf8');

var reader = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

reader.on('line', (line) => {
  lines.push(line);
});


reader.on('close', () => {
    let s = p.next();

    let mp = {};
    mp['A'] = '4';
    mp['E'] = '3';
    mp['G'] = '6';
    mp['I'] = '1';
    mp['O'] = '0';
    mp['S'] = '5';
    mp['Z'] = '2';

    let result_s = [...s].map((c) => mp[c] != undefined ? mp[c] : c).join("");
    console.log(result_s);
});