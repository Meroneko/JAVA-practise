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
    //縦幅, 横幅
    //- const[H, W] = [lines[0].split(" ")[0], lines[0].split(" ")[1]].map(Number);
    //+
    const init = lines[0].split(" ");//処理結果を変数に退避
    const H = +init[0];//先頭に+を付けて数値型に変換
    const W = +init[1];
    //+
    /*
      TODO
      lines[0].split(" ")を２回も呼び出すことはよろしくない。予め処理結果を変数に退避してから使いましょう。
      lines[0].split(" ")の結果が既に配列になっているため、その中の要素を使って新たに配列を作る必要はないと思います。
      尚、下記のようにシンプルに記載してもよいかと思います。
      const H = +xxx[0];  ※ jsの場合、先頭に+を付けると数値型に変換してくれる。
      const W = +xxx[1];
     */

    //縦横の区画を2次元配列に
    //花壇ではない区画を0、花壇の区画を1にリプレース
    let flowerBed = [];
    for (let i = 0; i < H; i++) {
        flowerBed.push(lines[i + 1].split(""));//読み替えを削除
        //- flowerBed.push(lines[i + 1].replace(/\./g, '0').replace(/#/g, '1').split("").map(Number));  // TODO .、#を0、1に読み替える必要性がなさそうです。
    }
    //必要なロープの本数
    let ropesCount = 0;
    //縦横の二重ループ
    for (let height = 0; height < H; height++) {
        for (let width = 0; width < W; width++) {
            if (flowerBed[height][width] == "#") {// 1 を "#" に変更
                ropesCount += 4;
                //上下左右に花壇がある場合、それぞれ必要なロープから1マイナス
                if (height + 1 < H && flowerBed[height + 1][width] == "#")  {// 1 を "#" に変更
                    //ropesCount -= 1;  // TODO マイナス１の場合、ropesCount--;の方が読みやすい。
                    ropesCount--;//デクリメント演算子でマイナス1
                }
                if (height - 1 >= 0 && flowerBed[height - 1][width] == "#") {// 1 を "#" に変更
                    ropesCount--;
                }
                if (width + 1 < W && flowerBed[height][width + 1] == "#") {// 1 を "#" に変更
                    ropesCount--;
                }
                if (width - 1 >= 0 && flowerBed[height][width - 1] == "#") {// 1 を "#" に変更
                    ropesCount--;
                }
            }
        }
    }
    console.log(ropesCount);
});

//TODOありがとうございました。
//次回以降教えて頂いたテクニックを使ってみます。