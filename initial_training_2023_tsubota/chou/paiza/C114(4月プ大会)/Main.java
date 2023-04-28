import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt(); //単語の個数
        String[] chArray = new String[count]; //単語の文字をそれぞれ文字列に移動させる
        char[] first = new char[count]; //頭文字と末尾文字の配列を作る
        char[] last = new char[count];
        String result =""; //結果
        sc.nextLine(); //前の行はintのため、改行マーカを消費する
        
        //頭文字と末尾文字の配列を作る
        for (int i=0; i<count; i++) {
            chArray[i] = sc.nextLine();
            } 
        for (int i=0; i<count; i++) {
            first[i] = chArray[i].charAt(0);
            last[i] = chArray[i].charAt(chArray[i].length() - 1);
            }
        
        //頭文字と末尾文字を比較し、結果を算出する
        for (int i=0; i<count-1; i++) {
                if (last[i]==first[i+1]){
                    result = "Yes";
                }else {
                    result = last[i]+" "+first[i+1];
                    break;
                }
        }  
        System.out.println(result);  //結果をアウトプット
    }        
} 