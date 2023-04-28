// C017:ハイアンドロー・カードゲーム
// (問題文のスクリーンショットはquestionフォルダ内にあります。)

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        // String line = sc.nextLine();
        // String[] pCards = line.split(" ");
        // int pCard1 = Integer.parseInt(pCards[0]);
        int pCard1 = sc.nextInt();
        int pCard2 = sc.nextInt();
        int cCard;
        boolean judge;
        int game = sc.nextInt();

        for(int i = 0; i < game; i++){
            cCard = sc.nextInt();
            // pCard = Integer.parseInt(pCards[0]);  // TODO pCardsを何回も型変換するより、ループの前に変換しておいた方が効率がいい。
            // if(pCard == cCard){
            //     cCard = sc.nextInt();
            //     pCard = Integer.parseInt(pCards[1]);
            //     if(pCard > cCard){
            //         judge = false;    // TODO System.out.printlnを各分岐に実装するより、大小関係を一旦boolean変数に退避し、比較の後にSystem.out.printlnを一回のみ実装した方が読みやすくなると思います。
            //     }else{
            //         judge = true;
            //     }
            // }else if(pCard < cCard){
            //     judge = false;
            //     cCard = sc.nextInt();
            // }else{
            //     judge = true;
            //     cCard = sc.nextInt();
            // }
            if(pCard1 == cCard){
                cCard = sc.nextInt();
                judge = pCard2 < cCard;
            }else{
                judge = pCard1 > cCard;
                cCard = sc.nextInt();
            }

            if (judge) {
                System.out.println("High");
            }else{
                System.out.println("Low");
            }
        }

    }
}

/*
追記：
ご指摘いただきましてありがとうございます。
おかげさまで、boolean型の使い方を学ぶことができたと同時に、
boolean型についての理解が未熟であることに気づかされました。
今後とも何卒よろしくお願いします。
*/