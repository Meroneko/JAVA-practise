import java.util.*;

public class Main {
    public static void main(String[] args ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        
        double result = (m*(1-0.01*p))*(1-0.01*q);
        
        System.out.println(result);
    }
}