import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int main_a = sc.nextInt();  //親カードの情報
        int main_b = sc.nextInt();
        int count = sc.nextInt();
        
        for (int i = 0; i < count; i++) {
            int sub_a = sc.nextInt(); //子カードの情報
            int sub_b = sc.nextInt();
            System.out.println(result(main_a,main_b,sub_a,sub_b));
        }
    }
    
    public static String result (int main_a, int main_b, int sub_a, int sub_b) { //比較＆出力
            if (sub_a >= main_a) {
                if (sub_b < main_b) {
                    return "Low";
                } else {
                    return "High";
                }
            } else {
                return "High";
            }
    }
}
