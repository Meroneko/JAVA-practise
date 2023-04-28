import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [][] array = new int[size+2][size+2]; //山+周囲の柵の二次元配列を作る size+2
        for(int i=1;i<size+1;i++){
            int [] _num = new int[size];
            for (int j=1;j<size+1;j++){
                _num[j-1] = sc.nextInt(); //それぞれの行を配列にインプット
            } 
            for(int j=1;j<size+1;j++){
                array[i][j]=_num[j-1]; //山の周りに"0"の柵をつける
            }
        }

        boolean up, down, left, right;
        ArrayList<Integer> mountTop = new ArrayList<Integer>();
        for(int i=1;i<size+1;i++){
            for(int j=1;j<size+1;j++){
                up=array[i][j]>array[i-1][j]?true:false;               //周囲との比較
                down=array[i][j]>array[i+1][j]?true:false;
                left=array[i][j]>array[i][j-1]?true:false;
                right=array[i][j]>array[i][j+1]?true:false;
                if(up==true && down==true && left==true && right==true){
                    mountTop.add(array[i][j]);
                }
            }
        }
        Collections.sort(mountTop);
        Collections.reverse(mountTop);
        for(int i : mountTop){  //高い順にソート
            System.out.println(i);
        }

    }
}

/* 入社前研修において解いてなかった問題です。
その時は基礎はきちんと理解できてなかったので、
あっちこっちエラー出てきて対応してきれなかったということでした。
今は無事にできました！ */