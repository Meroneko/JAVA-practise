// C101:【2021年Xmas問題】ラッキーデイ
// (問題文のスクリーンショットはquestionフォルダ内にあります。)

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String str;
        // Integer num;
        int ans = 0;

        for (int i = 0; i < 365; i++){
            // num = Integer.valueOf(i);
            // str = num.toString();  // TODO Integerに型変換してからtoString()を呼び出すのではなく、直接String.valueOf(i)で行える。
            str = String.valueOf(i);
            if(str.contains(line)){
                ans++;
            }
        }
        System.out.println(ans);
    }
}

/*
追記：
ご指摘ありがとうございます。
直接型変換を行えるとは思っていなかったので、目から鱗でした。
今後とも何卒よろしくお願いします。
*/