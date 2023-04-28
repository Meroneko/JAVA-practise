import java.util.*;

public class Main{
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int M = sc.nextInt();

        var routes = new int[N][M];

        for (int i = 0; i < routes.length; i++) {
            for (int j = 0; j < routes[0].length; j++) {
                routes[i][j] = sc.nextInt();
            }
        }

        final int X = sc.nextInt();

        int sum = 0;
        int r, s, beforeS = 0;
        for (int i = 0; i < X; i++) {
            r = sc.nextInt()-1;
            s = sc.nextInt()-1;

            sum += Math.abs(routes[r][s] - routes[r][beforeS]);

            beforeS = s;
        }

        System.out.println(sum);

        sc.close();
    }
}