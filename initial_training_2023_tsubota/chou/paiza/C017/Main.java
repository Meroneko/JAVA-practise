import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int main_a = sc.nextInt();
        int main_b = sc.nextInt();
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int sub_a = sc.nextInt();
            int sub_b = sc.nextInt();
            if (sub_a > main_a) {
                System.out.println("Low");
            } else if (sub_a == main_a) {
                if (sub_b < main_b) {
                    System.out.println("Low");
                } else {
                    System.out.println("High");
                }
            } else {
                System.out.println("High");
            }
        }

    }
}
