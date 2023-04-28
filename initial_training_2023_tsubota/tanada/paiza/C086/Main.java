import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        //文字列からaAeEiIoOuUに含まれるすべての文字を探し""に置き換える
        System.out.println(line.replaceAll("[aAeEiIoOuU]", ""));
    }
}