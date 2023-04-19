import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int length = 0;
        int area = 0;

        for (int i = 1; i < n; i++) {
            int coveredLength = sc.nextInt();
            length = length + d - coveredLength;
        }
        area = d * length;
        System.out.println(area);
        
        
    }
}
