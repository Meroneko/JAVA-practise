let lines = [];

class Pointer{
    constructor(){ this.count = 0;}
    next(){ return lines[this.count++];}
}

pt = new Pointer();

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
    let [m, p, q] = pt.next().split(' ').map(Number);

    console.log(m*(100-p)/100.0*(100-q)/100.0);
});