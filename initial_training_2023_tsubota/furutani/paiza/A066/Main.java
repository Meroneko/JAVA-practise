import java.util.*;

public class Main{
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        final int INF = 1000000;
        final int N = sc.nextInt();

        var ranges = new int[N+1][2];

        //入力
        for (int i = 0; i < N; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            ranges[i] = new int[]{start, end};
        }
        ranges[N] = new int[]{INF, INF};
        Arrays.sort(ranges, (a, b) -> a[0]-b[0]);

        //最長を計算
        int currentStart = ranges[0][0];
        int currentEnd = 0;
        int maxLength = 0;
        for(int i = 0; i < N; i++){
            int nextStart = ranges[i+1][0];
            
            //範囲拡大 or 次の範囲に変更
            currentEnd = Math.max(currentEnd, ranges[i][1]);

            //新しい範囲が非連結 -> 範囲長を計算し、次の範囲へ
            if(currentEnd+1 < nextStart){
                maxLength = Math.max(maxLength, currentEnd-currentStart);
                currentStart = nextStart;
            }
        }
        
        //出力
        System.out.println(maxLength+1);

        sc.close();
    }
}
// Main_beforeFix.javaに含まれる全く同じ処理を1つにまとめたのですが、
// かえって文量が増え、可読性が下がってしまったかもしれません。

// 重複していた処理: maxLength更新処理