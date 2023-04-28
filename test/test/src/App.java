import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        int count = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<count; i++) {
            String str1 = sc.nextLine();
            char last = str1.charAt(str1.length() - 1); //文字列最後の文字を切り出し
            String str2 = sc.nextLine();
            char first = str2.charAt(0);
            if (last != first){
                result = last+" "+first;
                break;
            } 
        } 
        if (result.equals(""))  {
            System.out.println("Yes");
        } else {
            System.out.println(result);
        }
    }
}
