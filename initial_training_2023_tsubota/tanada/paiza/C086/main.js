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
  //文字列からaAeEiIoOuUに含まれるすべての文字を探し''に置き換える
  console.log(lines[0].replace(/[aAeEiIoOuU]/g, ''));
});