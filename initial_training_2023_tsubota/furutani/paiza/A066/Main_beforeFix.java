import java.util.*;

public class Main{
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        final int N = sc.nextInt();

        var ranges = new int[N][2];

        //入力
        for (int i = 0; i < N; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            ranges[i] = new int[]{start, end};
        }
        Arrays.sort(ranges, (a, b) -> a[0]-b[0]);

        //最長を計算
        int currentStart = ranges[0][0];
        int currentEnd = ranges[0][1];
        int maxLength = 0;
        for(int i = 1; i < N; i++){
            int start = ranges[i][0];
            int end = ranges[i][1];

            //新しい範囲が非連結 -> 範囲長を計算し、次の範囲へ
            if(currentEnd+1 < start){
                maxLength = Math.max(maxLength, currentEnd-currentStart);
                currentStart = start;
            }
            //範囲拡大 or 次の範囲に変更
            currentEnd = Math.max(currentEnd, end);
        }
        maxLength = Math.max(maxLength, currentEnd-currentStart);
        
        //出力
        System.out.println(maxLength+1);

        sc.close();
    }
}