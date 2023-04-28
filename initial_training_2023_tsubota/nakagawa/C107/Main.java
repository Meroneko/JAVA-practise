// C107:ランクの計算
// (問題文のPDFはquestionフォルダ内にあります。)

import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Double> rank = new ArrayList<>();
        int race = sc.nextInt();
        int score = sc.nextInt();
        int ans = 1;

        // 馬3頭分の処理
        for(int i = 0; i < 3; i++){
            ArrayList<Integer> horse = new ArrayList<>();
            ArrayList<Double> result = new ArrayList<>();

            // 受け取った順位をArrayList horseに格納
            for(int j = 0; j < race; j++){
                horse.add(sc.nextInt());
            }


            // 連続するscore分のレースの平均値を求める
            for(int j = 0; j < race - score + 1; j++){
                double avg = 0;
                for(int k = 0; k < score; k++){
                    int num = k + j;
                    avg += Double.valueOf(horse.get(num));  // TODO numを使わず、直接get(k + j)でもいいかと思います
                }
                avg /= score;  // TODO avgが合計値を退避する変数から平均値を退避する変数に変わっている。これは変数の使いまわしになるので、よろしくない。
                result.add(avg);
            }
            // 一番少ない平均値＝ランクとしてArrayList rankに格納する。
            rank.add(Collections.min(result));
        }

        // 一番いいランク(＝少ない平均値)の馬の番号を出力する
        ans += rank.lastIndexOf(Collections.min(rank));
        System.out.println(ans);

    }
}