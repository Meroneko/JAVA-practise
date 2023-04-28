// paizaラーニング スキルチェック　C086:ハンドルネームの生成
// (問題文のスクリーンショットはquestionフォルダ内にあります。)

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(line.replace("a","").replace("i","").replace("u","").replace("e","").replace("o","").replace("A","").replace("I","").replace("U","").replace("E","").replace("O",""));
    }
}


/*

追記：解決いたしました！ありがとうございます。


【質問内容】
問題には正解できましたが、.replace()の部分を
A～O、a～oの合計10個も書くのは、さすがに長すぎると思いました。

なにか短縮できる方法等、ございましたら教えていただけるとありがたいです。

【試したこと】
for文を使えば、.replace()を多く書かずに済むのではないかと思い、
予めA～O、a～oを配列に入れてfor文で.replace()を
使って消せないか試しました。
しかし、.replace()を使った文字列の変更は変数等に保存されないため、
for文のたびに元の文字列に戻ってしまい、やむを得ずこの形になりました。
// TODO
for文でできると思います。
line.replace(...)処理はlineの値を変更してくれないので、下記のように実装します。
line = line.replace(...)
*/