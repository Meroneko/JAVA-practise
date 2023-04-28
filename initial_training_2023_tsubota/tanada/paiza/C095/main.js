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
  // 合言葉
  const secret = lines[0];
  const secretCharArray = secret.split("");
  // 入力
  const trySecret = lines[1];
  const trySecretCharArray = trySecret.split("");
  // 結果
  let result = "NO";

  let charIndex = -1;
  // 合言葉と入力が同じではないかつ長さが同じとき
  if (secret != trySecret && secretCharArray.length == trySecretCharArray.length) {
    for (let i = 0; i < secretCharArray.length; i++) {
      // 入力の合言葉のi文字目の位置を代入/ない場合-1が代入される
      charIndex = trySecretCharArray.findIndex((element) => element == secretCharArray[i]);
      if (charIndex >= 0) {
        // 入力から合言葉のi文字目を削除
        trySecretCharArray.splice(charIndex, 1);
      }
    }
    // 入力から文字がすべて消えていたら結果にYesを代入
    if (trySecretCharArray.length == 0) {
      result = "YES";
    }
  }
  console.log(result);

});