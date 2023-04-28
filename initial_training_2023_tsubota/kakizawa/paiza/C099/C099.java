import java.util.ArrayList;
import java.util.Scanner;

/**
 * C099
 */
public class C099 {
    public static void main(String[] args) {
        int n;
        int d;
        int x;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        d = sc.nextInt();
        x = n * d;

        for (int i = 0; i < n-1; i++) {
            int input = sc.nextInt();
            x -= input;
        }

        System.out.println(d*x);

        sc.close();
    }
}