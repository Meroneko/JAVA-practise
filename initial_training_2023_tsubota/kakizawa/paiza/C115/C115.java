import java.util.ArrayList;
import java.util.Scanner;

/**
 * C115
 */
public class C115 {
    public static void main(String[] args) {
        int N;
        int M;
        int totalTraficJam = 0;
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        for (int i = 0; i < N-1; i++) {
            int distance = sc.nextInt();
            if(distance <= M){
                totalTraficJam += distance;
            }
        }

        System.out.println(totalTraficJam);

        sc.close();
    }
}