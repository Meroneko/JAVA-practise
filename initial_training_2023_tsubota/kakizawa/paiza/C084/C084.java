import java.util.Scanner;

/**
 * C084
 */
public class C084 {
    public static void main(String[] args) {
        String s = "";
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        
        for (int i = 0; i < s.length()+2; i++) {
            System.out.print("+");
        }
        System.out.println();

        StringBuilder s2 = new StringBuilder();
        s2.append("+");
        s2.append(s);
        s2.append("+");
        System.out.println(s2);

        for (int i = 0; i < s.length()+2; i++) {
            System.out.print("+");
        }
        System.out.println();

        sc.close();
    }
}