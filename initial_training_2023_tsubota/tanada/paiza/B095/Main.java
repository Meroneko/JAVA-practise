import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String[] init = sc.nextLine().split(" ");
        int personNum = Integer.parseInt(init[0]);
        int measureNum = Integer.parseInt(init[1]);

        int[] properPitch = new int[measureNum];
        //for (int i = 0; i < measureNum; i++) properPitch[i] = sc.nextInt();  // TODO ループの中身が１行しかなくても、{}でくくって改行実装した方が読みやすくなる。
        for (int i = 0; i < measureNum; i++) {
            properPitch[i] = sc.nextInt(); // TODOを参考に{}でくくり、改行を追加
        }
        int maxScore = 0;
        for (int personCount = 0; personCount < personNum; personCount++) {
            int score = 100;
            for (int measureCount = 0; measureCount < measureNum; measureCount++) {
                int pitchDeviation = Math.abs(sc.nextInt()-properPitch[measureCount]);
                /*
                if (pitchDeviation <= 5) {
                    TODO
                    明示的な処理のない分岐をなるべく実装しないようにしましょう。
                    例）
                    if (pitchDeviation > 30) {
                    } else if (pitchDeviation > 20) {
                    } else if (pitchDeviation > 10) {
                    } else if (pitchDeviation > 5) {
                    }
                  ;
                } else if (pitchDeviation <= 10) {
                    score-=1;
                } else if (pitchDeviation <= 20) {
                    score-=2;
                } else if (pitchDeviation <= 30) {
                    score-=3;
                } else {
                    score-=5;
                }
                 */
                // TODOを参考に処理のない分岐を削除
                if (pitchDeviation > 30) {
                    score-=5;
                } else if (pitchDeviation > 20) {
                    score-=3;
                } else if (pitchDeviation > 10) {
                    score-=2;
                } else if (pitchDeviation > 5) {
                    score-=1;
                }
            }
            if (score > maxScore) {
                maxScore = score;
            }
        }

        System.out.println(maxScore);
    }
}

// 処理のない分岐は避ける
// １行にできるコードも読みやすさのために改行を入れる