import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String[] init = sc.nextLine().split(" ");
        //車の数
        int carsCount = Integer.parseInt(init[0]);
        //渋滞とみなされる車間距離
        int distanceDefinition = Integer.parseInt(init[1]);
        //渋滞の距離
        int totalTrafficDidtance = 0;  // TODO taotal → total
        while(carsCount>1) {
            int line = sc.nextInt();
            //車間距離が渋滞とみなされる距離以下だった場合渋滞の距離に加算
            if (line <= distanceDefinition) {
                totalTrafficDidtance+=line;
            }
            carsCount--;
        }
        System.out.println(totalTrafficDidtance);
    }
}