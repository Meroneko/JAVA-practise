import java.util.*;

public class App {
    public static void main(String[] args ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        
        for (int i = 1; i <= N; i++) {
            boolean multiX = isMulti(i,X);
            boolean multiY = isMulti(i,Y);
            
            if (multiX && multiY) {
                System.out.println("AB");
            } else if (multiX) {
                System.out.println("A");
            } else if (multiY) {
                System.out.println("B");
            } else {
                System.out.println("N");
            }
        }
    }
    
    public static boolean isMulti(int i, int number) {
        return number % i == 0;
    }
}
