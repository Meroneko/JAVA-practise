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
    //名前の数
    const nameNum = Number(lines[0]);
    //linesの0番目の要素を削除し、後の要素を詰める
    lines.shift();
    //最長の連続部分文字列の長さ
    let maxSameChar = 0;
    //比較する名前1の要素番号i
    for (let i = 0; i < nameNum; i++) {
        //比較する名前2の要素番号j
        for (let j = i + 1; j < nameNum; j++) {
            //名前1の部分文字列の開始位置k
            for (let k = 0; k < lines[i].length; k++) {
                //名前2の部分文字列の開始位置l
                for (let l = 0; l < lines[j].length; l++) {
                    //部分文字列の長さm
                    for (let m = 1; k + m <= lines[i].length, l + m <= lines[j].length; m++) {
                        //名前1名前2の指定した開始位置、長さの文字列が同じだった場合mとmaxSameCharをMath.maxで比較し大きい方を代入
                        if (lines[i].substr(k, m) == lines[j].substr(l, m)) {
                            maxSameChar = Math.max(maxSameChar, m);
                        //文字列が同じではなかったら長さmのforを抜ける
                        } else {
                            break;
                        }
                    }
                }
            }
        }
    }
    console.log(maxSameChar);
});