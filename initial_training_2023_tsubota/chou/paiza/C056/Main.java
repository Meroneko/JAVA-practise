import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt(); // 人数
        int pass_score = sc.nextInt(); // 合格点数

        for (int i = 0; i < count; i++) {
            int exam_score = sc.nextInt();
            int absence_times = sc.nextInt();
            int final_score = exam_score - 5 * absence_times;
            final_score = final_score < 0 ? 0 : final_score;
            if (final_score >= pass_score) {
                System.out.println(i + 1);
            }
        }

    }
}
