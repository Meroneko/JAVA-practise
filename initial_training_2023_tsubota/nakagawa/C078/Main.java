// C078:株の売買
// (問題文のスクリーンショットおよび実行結果はquestionフォルダ内にあります。)

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int cond1 = sc.nextInt();
        int cond2 = sc.nextInt();
        int rate;
        int kk = 0;
        int money = 0;
        int ans  = 0;
        sc.nextLine();
        for(int i = 1; i <= day; i++){
            rate = sc.nextInt();

            if(i == day){
                ans = (kk * rate) + money;
            }

            if(rate > cond1 && rate < cond2){
                continue;
            }else if(rate >= cond2){
                money += kk * rate;
                kk = 0;
            }else{
                money -= rate;  // TODO 株を買えない（money＜rate）場合の考慮が必要かな。
                kk++;
            }
        }
        System.out.println(ans);
    }
}

/*
【問題点】
実行結果でテストケース6だけ出力結果が異なってしまいました。
*/