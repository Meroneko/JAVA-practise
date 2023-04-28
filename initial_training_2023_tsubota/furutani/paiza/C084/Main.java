import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        StringBuilder builder = new StringBuilder();
        // for(int i = 0; i < s.length()+2; i++)   builder.append('+');  // TODO ループの中身が１行しかなくても、{}でくくって改行実装した方が読みやすくなる。
        // builder.append("\n");  // TODO OSによって、改行は\nだったり、\r\nだったりするため、自前で書くよりSystem.out.println(...)で改行した方がよい。
        for(int i = 0; i < s.length()+2; i++){
            builder.append('+');
        }

        System.out.println(builder.toString());
        System.out.println("+" + s + "+");
        System.out.println(builder.toString());
        scanner.close();
    }
}

// レビューして頂きありがとうございます。参考にさせて頂きます。