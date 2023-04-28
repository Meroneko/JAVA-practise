import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int result = 0;
        int number = 0;
        
        String ch [] = line.split("");//文字列を分割する
        
        for (String i : ch) {
            if (i.equals("/")) {
                number++;
            } else if (i.equals("<")) {
                number += 10;
            } else if (i.equals("+")){
                result += number;
                number = 0;
            }
        }
        result += number;
        System.out.println(result);
    }
}
