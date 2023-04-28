import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();                // 応募者の人数
        final int X = sc.nextInt();                // プレゼント A の当選者となる倍数
        final int Y = sc.nextInt();                // プレゼント B の当選者となる倍数
        
        String result;                             // 当選情報  // TODO s = "N"の部分を19行目当たりにelse {}の節に書いた方がいいと思います。
        boolean isMultipleOfX;
        boolean isMultipleOfY;
        for(int i = 1; i <= N; i++) {
            isMultipleOfX = i % X == 0;
            isMultipleOfY = i % Y == 0;
            if(isMultipleOfX && isMultipleOfY) {   // TODO 同じ計算「i % X」が11行目と14行目と２回もしていることはよろしくない（特に重たい計算の場合）。計算結果を変数に退避し、変数で分岐判定しましょう。
                result = "AB";
            }
            else if(isMultipleOfX) {
                result = "A";
            }
            else if(isMultipleOfY) {
                result = "B";
            }
            else {
                result = "N";
            }
            System.out.println(result);
        }
    }
}

// レビューしていただきありがとうございます。