import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //初期の残高
        int m = sc.nextInt(); //乗車回数
        int point = 0;
        
        for (int i = 0; i < m; i++ ) {
            int fee = sc.nextInt(); //今回のバス代
            if (point >= fee) { //ポイントが運賃より高いの場合
                point -= fee;
                System.out.println(n+" "+point);
            } else { //ポイントが運賃より低いの場合
                n -= fee; 
                point += 0.1 * fee;
                System.out.println(n+" "+point);
            }
        } 
    }
}