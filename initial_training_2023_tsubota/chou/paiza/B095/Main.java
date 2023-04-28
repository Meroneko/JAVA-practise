import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //人数
        int m = sc.nextInt(); //課題曲の長さ
        int right_interval[] = new int[m];
        int person_interval[][] = new int[n][m]; //personの二次元配列を作る
        int person_score[] = new int [n];

        for (int i = 0 ; i < m; i++) {  //句ごとに正しいhzを獲得
            right_interval[i] = sc.nextInt();
        } 
        
/* ------------------------------------------------------------------------------------------
        for (int i : right_interval) {   //正しい音程を確認する（完成後削除）
            System.out.println(i);
        }
------------------------------------------------------------------------------------------ */

        for (int i = 0; i < n; i++) {   //personごとに音程を獲得およびスコア計算
            person_score[i] = 100;  //person i番目 初期の100点を付与する
            for (int j = 0; j < m; j++) {
                person_interval[i][j] = sc.nextInt();  //person i番目の j番目の音程を獲得する
                int diff = Math.abs(person_interval[i][j] - right_interval[j]);  //正しい音程との差を算出する
                if (diff <= 5) {  //正しい音程との比較
                    continue;
                } else if (diff <= 10) {
                    person_score[i] -= 1;
                } else if (diff <= 20) {
                    person_score[i] -= 2;
                } else if (diff <= 30) {
                    person_score[i] -= 3;
                } else {
                    person_score[i] -= 5;
                }
            }
            if (person_score[i] < 0){  //成績を最低0にする
                person_score[i] = 0;
            } 
        } 
        
/* ------------------------------------------------------------------------------------------
        for (int[]ary : person_interval){  //二次元配列要素を確認する（完成後削除）
            for (int i = 0; i < ary.length; i++) {
                System.out.print(ary[i]+" ");
            } 
            System.out.println();
        }
------------------------------------------------------------------------------------------ */        

        System.out.println(getMax(person_score));  //結果を出力する
        
    }
    
    public static int getMax (int[] num){   //配列の最大値を求める
        int max = num[0];
        for (int i = 1; i < num.length ; i++){
            if(max < num[i]){
                max = num[i];
            }
        }
        return max;
    } 
    
    
}


//最初版は基本的な配列を使って、明日Arraylistを使って書き替えてみたいと思います。