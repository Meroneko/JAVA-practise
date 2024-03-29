// C115:渋滞の距離
// (問題文のPDFはquestionフォルダ内にあります。)

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] str = line.split(" ");
        int cars = Integer.parseInt(str[0]);
        int traffic = Integer.parseInt(str[1]);
        int distance = 0;
        int ans = 0;
        
        for(int i = 1; i < cars; i++){
            distance = sc.nextInt();
            if(distance <= traffic){
                ans += distance;
            }
        }
        
        System.out.println(ans);
    }
}