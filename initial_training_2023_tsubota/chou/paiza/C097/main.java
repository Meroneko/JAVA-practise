import java.util.*;

public class Main {
    public static void main(String[] args ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % X == 0) {
                if (i % Y == 0) {  // TODO 同様な計算が複数箇所（17行目も）で行っていることはよくないので、予め計算結果を変数に退避してから使いましょう。
                    System.out.println("AB");
                } else {
                    System.out.println("A");
                }
            } else if (i % Y == 0) {
                if (i % X == 0) {
                    System.out.println("AB");  // TODO ここには一生たどり着かないと思います。
                } else {
                    System.out.println("B");
                }
            } else {
                System.out.println("N");
            }
        }

    }
}