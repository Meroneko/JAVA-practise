import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 入力を受け取る
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();                        // レースの回数
        final int K = sc.nextInt();                        // スコアの計算に用いられる整数
        final int[][] RANK_LIST = new int[3][N];           // レースの順位表
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < N; j++) {
                RANK_LIST[i][j] = sc.nextInt();
            }
        }
        double minRank = N;                                // ランクの最小値
        int minRankHorse = 1;                              // ランクが最小である馬番号
        for(int i = 0; i < 3; i++) {
            // ランクを計算
            double rank = 18;                              // ランク（平均値の最小値）, 18: 順位の最大値
            for(int j = 0; j < N - K + 1; j++) {
                // 順位の平均値を求める
                double rankSum = 0;                        // 連続するK回分のレースの順位の平均値
                for(int k = 0; k < K; k++) {
                    rankSum += RANK_LIST[i][j + k];
                }
                double rankAvg = rankSum / K;  // TODO rankAvgが合計値を退避する変数から平均値を退避する変数に変わっている。これは変数の使いまわしになるので、よろしくない。
                // 順位の平均値の最小値を更新
                if(rankAvg < rank) {
                    rank = rankAvg;
                }
            }
            // ランクの最小値と馬番号を更新
            if(rank < minRank) {
                minRank = rank;
                minRankHorse = i + 1;
            }
        }
        System.out.println(minRankHorse);
    }
}
// レビューしていただきありがとうございます。