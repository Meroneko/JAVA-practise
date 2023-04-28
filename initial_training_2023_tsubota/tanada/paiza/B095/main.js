process.stdin.resume();
process.stdin.setEncoding('utf8');
// 自分の得意な言語で
// Let's チャレンジ！！
var lines = [];
var reader = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});
reader.on('line', (line) => {
  lines.push(line);
});
reader.on('close', () => {
  //人数, 小節数
  const [personNum, measureNum] = [Number(lines[0].split(" ")[0]), Number(lines[0].split(" ")[1])]
  //正しい音程の配列を初期化し、for文で音程を追加
  const properPitch = [];
  for (let i = 1; i <= measureNum; i++) {
      properPitch.push(Number(lines[i]))
  }
  //最高得点
  let maxScore = 0;

  //人数分回すfor文
  for(let personCount = 1; personCount <= personNum; personCount++) {
      let score = 100;
      //小節数回すfor分
      for(let measureCount = 0; measureCount < measureNum; measureCount++) {
          //正しい音程との差を絶対値で取得
          let pitchDeviation = Math.abs(Number(lines[(personCount*measureNum)+measureCount+1]) - properPitch[measureCount]);
          if (pitchDeviation <= 5) {
              ;
          } else if (pitchDeviation <= 10) {
              score-=1;
          } else if (pitchDeviation <= 20) {
              score-=2;
          } else if (pitchDeviation <= 30) {
              score-=3;
          } else {
              score-=5;
          }
      }
      if (score > maxScore) {
          maxScore = score;
      }
  }
  console.log(maxScore);
});