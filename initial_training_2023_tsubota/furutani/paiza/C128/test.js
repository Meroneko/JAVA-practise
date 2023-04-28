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
    let n = +p.next();
    
    function recur(countDown){
        const value = +p.next();
        if(countDown == 1)    return [value, 1];
        const [yy, xx] = recur(countDown-1);
        // console.log(`y, x = ${yy}, ${xx}`);
        return [value*yy+xx, yy];
    }
    
    let [x, y] = recur(n);
    console.log(`${x} ${y}`);
});