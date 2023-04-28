import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int length = 0;
        int area = 0;

        for (int i = 1; i < n; i++) {
            int coveredLength = sc.nextInt(); // カバーされている部分を引く
            length = length + d - coveredLength; // トータルの長さを求める
        }
        area = d * (d + length); // 面積を求める
        System.out.println(area);
    }
}