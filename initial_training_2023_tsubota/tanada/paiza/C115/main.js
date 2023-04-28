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
  //車の数, 渋滞とみなされる車間距離
  // 杉江さん TODO: split関数では、配列が生成されるので以下のように書けると思います。
  //                const [carsCount, distanceDefinition] = lines[0].split(" ");
  //https://gitlab.smallit.co.jp/yuki.tsubota/initial_training_2023_tsubota/-/commit/caedc5614f8c25cde64128301af91307b778f491#note_8103
  //const [carsCount, distanceDefinition]  = [lines[0].split(" ")[0], lines[0].split(" ")[1]];
  const [carsCount, distanceDefinition]  = lines[0].split(" ");

  //渋滞の距離
  let taotalTrafficDidtance = 0;
  for(let i = 1; i < lines.length; i++) {
      //車間距離が渋滞とみなされる距離以下だった場合渋滞の距離に加算
      if(Number(lines[i])<=distanceDefinition) {
          taotalTrafficDidtance += Number(lines[i]);
      }
  }
  console.log(taotalTrafficDidtance);
  
});