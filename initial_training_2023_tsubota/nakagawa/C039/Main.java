// paizaラーニング スキルチェック　C039:古代の数式
// (問題文のスクリーンショットはquestionフォルダ内にあります。)

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] formula = line.split("");
        int ans = 0;

        for(int i = 0; i < formula.length; i++){
            // if(formula[i].equals("/")){
            if("/".equals(formula[i])){
                ans++;
            // }else if(formula[i].equals("<")){
            }else if("<".equals(formula[i])){
                ans += 10;
            }
        }

        System.out.println(ans);
    }
}

/*
追記：ご回答いただきありがとうございます。
また、ご指摘と解決法を提示いただけたおかげで
nullの場合を考慮せず、プログラムを作成してしまっていたことに気づくことができました。
今後とも何卒宜しくお願い致します。

【疑問点・気になっていること】
「/」と「<」の判定は行っていますが、
「+」記号の存在を全く無視したプログラムになってしまっている点が問題の意図として
正しいのかが気になります。

// TODO
「+」記号は「ans++」、「ans +=」の方で実装しているので、問題ないと思います。
強いといえば、文字列の比較は「定数.equals(変数)」の方がいい。
「変数.equals(定数)」だと、変数がnullの場合、異常終了してしまう。
formula[i].equals("/")
　↓
"/".equals(formula[i])
*/