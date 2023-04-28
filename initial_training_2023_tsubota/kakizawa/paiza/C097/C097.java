import java.util.Scanner;

/**
 * C097
 */
public class C097 {
    public static void main(String[] args) {
        int n;
        int x;
        int y;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if(i % x == 0 && i % y == 0){
                System.out.println("AB");
            } else if(i % x == 0) {
                System.out.println("A");
            } else if(i % y == 0) {
                System.out.println("B");
            } else {
                System.out.println("N");
            }
        }

        sc.close();
    }
}