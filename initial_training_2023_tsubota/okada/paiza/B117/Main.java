import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        List<Integer> cars = new ArrayList<>();
        int count = 0;  // 車Nがコースを回る回数
        for(int i = 0; i < N; i++) {
            cars.add(sc.nextInt());
        }

        int nextCarNum = 1;
        int carIdx = 0;

        while(true) {
            int targetCar = cars.get(carIdx);
            // 次の車が出るべき車の場合出口から出る
            if(targetCar == nextCarNum) {  
                // 最後の車であれば終了  
                if(targetCar == N) {
                    break;
                }
                else {
                    // 次に出るべき車の番号を更新
                    nextCarNum++;
                }
            }

            // 車Nが出口を通り過ぎたらカウント
            if(targetCar == N) {
                count++;
            }

            // 配列の最後まで見たら最初に戻る
            carIdx = (carIdx < N - 1) ? carIdx + 1 : 0;
        }
        System.out.println(count);
    }
}

// 車が回るという問題文通りにfor文、while文を用いて回しているので無駄な部分があるような気がします。


// 以下のように書くとループ1回で書くことができます。
// remove()は不具合の温床になるので極力使わないようにしましょう。

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         final int N = sc.nextInt();
//         List<Integer> cars = new ArrayList<>();
//         int count = 0;  // 車Nがコースを回る回数
//         for(int i = 0; i < N; i++) {
//             cars.add(sc.nextInt());
//         }
//         int nextCarNum = 1;
//         int i = 0;
//         while(true) {
//             int targetCar = cars.get(i);
            
//             // 次の車が出所する車かどうか調べる。出所する場合、最後の車であればbreakし、それ以外は探すべき車の値を更新する
//             if(targetCar == nextCarNum) {
//                 if(targetCar == N){
//                     break;
//                 }else{
//                     nextCarNum++;
//                 }
//             }
            
//             // 車Nが出口を通り過ぎたらカウント
//             if(targetCar == N) {
//                 count++;
//             }
            
//             // 配列の最後まで見たら最初に戻る
//             i = (i < N - 1) ? i + 1 : 0;
//         }
//         System.out.println(count);
//     }
// }


// レビューしていただきありがとうございます。remove()についても承知いたしました。