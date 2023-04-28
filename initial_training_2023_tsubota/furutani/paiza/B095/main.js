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
    let [n, m] = pt.next().split(" ").map(Number);

    basePitch = [];
    for(let i = 0; i < m; i++){
        basePitch.push(Number(pt.next()));
    }
    
    let maxScore = 0;

    let _currentPitch;
    let _score, _diff;
    for(let i = 0; i < n; i++){
        _score = 100;
        for(let j = 0; j < m; j++){
            _currentPitch = Number(pt.next());
            _diff = Math.abs(basePitch[j] - _currentPitch);

            if(_diff <= 5)           continue;
            else if(_diff <= 10)     _score -= 1;
            else if(_diff <= 20)     _score -= 2;
            else if(_diff <= 30)     _score -= 3;
            else                     _score -= 5;
        }

        if(maxScore < _score){
            maxScore = _score;
        }
    }

    console.log(maxScore);
});