import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //人数
        int m = sc.nextInt(); //課題曲の長さ
        int person_interval[][] = new int[n][m]; //personの二次元配列を作る
        int max_score = 0;

        
        ArrayList<Integer> person_score = new ArrayList<Integer>();
        ArrayList<Integer> right_interval = new ArrayList<Integer>();
        
        for (int i = 0 ; i < m; i++) {  //句ごとに正しいhzを獲得
            right_interval.add(sc.nextInt());
        } 
        
      
        for (int i = 0; i < n; i++) {   //personごとに音程を獲得およびスコア計算
            int _score = 100;
            for (int j = 0; j < m; j++) {
                person_interval[i][j] = sc.nextInt();  //person i番目の j番目の音程を獲得する
                int diff = Math.abs(person_interval[i][j] - right_interval.get(j));  //正しい音程との差を算出する
                if (diff <= 5) {  //正しい音程との比較
                    continue;
                } else if (diff <= 10) {
                    _score -= 1;
                } else if (diff <= 20) {
                    _score -= 2;
                } else if (diff <= 30) {
                    _score -= 3;
                } else {
                    _score -= 5;
                }
            }
            max_score = _score > max_score ? _score : max_score ;  //最大値の処理
            max_score = max_score < 0 ? 0: max_score;   //成績を最低0にする
        } 
        System.out.println(max_score);  //結果を出力する
    }
}

//三回目のリファクターは、必要はないを減らした・ifの省略（三項演算子）を試した