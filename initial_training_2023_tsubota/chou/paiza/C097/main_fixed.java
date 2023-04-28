import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        boolean multiX;
        boolean multiY;
        String result;
        
        for (int i = 1; i <= N; i++) {
            multiX = isMulti(i, X);
            multiY = isMulti(i, Y);

            if (multiX && multiY) {
                result = "AB"; // 一生にたどり着かない場所にもう行かない
            } else if (multiX) {
                result = "A";
            } else if (multiY) {
                result = "B";
            } else {
                result = "N";
            }
        }
    }

    public static boolean isMulti(int i, int number) {
        return i % number == 0;
    }

    public static void printout() {
        System.out.println(result);
    }
}

//指摘いただきありがとうございます！
//少し修正しましたが、またどこか改善点があればぜひよろしくお願いします！

// 追加：岡田さんの課題を読んで、System.out.println()の複数出力を変数resultにしました。読みやすくなりました！
/*
 *  ------------------------------
 *  |   計算ロジックのブロック    |
 *  |   ↓             　    　 　 |
 *  |   結果出力のブロック        |
 *  ------------------------------
 */