import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phone_number = sc.nextLine(); // stringで入力する
        phone_number = phone_number.replace("-", ""); // ハイフンを取り除く
        String[] str_number = phone_number.split(""); // それぞれの数字を取り出し、配列に入れる
        int[] number = Arrays.stream(str_number).mapToInt(Integer::parseInt).toArray(); // Stringの配列をintの配列に変える
        int count = 0;
        
        for (int i : number) {// 距離を計算する
            count += dial_distance(i);
        }
        System.out.println(count);

    }

    public static int dial_distance(int number) { // 数字により移動する距離
        // TODO number1~9の場合、returnの値は(number + 2) * 2 になっています。プログラムをもう少し簡潔に変更してみてください。
        if (number == 0) {
            return 12 * 2;
        } else {
            return (number + 2) * 2;
        }
        // TODO elseは必要でしょうか？
    }
}
