import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int move = 0;
        int floor = 1;
        
        for (int i = 0; i < n; i++) {
            int now_floor = sc.nextInt();
            move += Math.abs(floor - now_floor);
            floor = now_floor;
        }
        System.out.println(move);
    }
}