import java.util.*;

public class Main{
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        int m = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();

        System.out.println(m*(100-p)/100.0*(100-q)/100.0);

        sc.close();
    }
}