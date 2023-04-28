import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 入力を受け取る
        Scanner sc = new Scanner(System.in);
        final char[] chars = sc.next().toCharArray();
        final int len = chars.length;
        // 入力をint型の配列に変換
        int[] nums = new int[len];
        for(int i = 0; i < len; i++) {
            nums[i] = Character.getNumericValue(chars[i]);
        }
        // 二次元バーコードを作成
        boolean [][] barcode = new boolean[len][9];
        for(int i = 0; i < len; i++) {
            int n = nums[i];
            int beginRow = (i / 3) * 3;
            int beginCol = (i % 3) * 3;
            for(int j = 0; j < n; j++) {
                int diffRow = j / 3;
                int diffCol = j % 3;
                barcode[beginRow + diffRow][beginCol + diffCol] = true;
            }
        }
        // 出力
        for(boolean[] row : barcode) {
            for(boolean r : row) {
                System.out.print(r ? "#" : ".");
            }
            System.out.println();
        }
    }
}