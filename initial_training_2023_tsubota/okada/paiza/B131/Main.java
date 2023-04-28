import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int numRoute = sc.nextInt();                        // 路線の数
        final int numStation = sc.nextInt();                      // 駅の数
        final int[][] priceList = new int[numRoute][numStation];  // 料金表
        for(int i = 0; i < numRoute; i++) {
            for(int j = 0; j < numStation; j++) {
                priceList[i][j] = sc.nextInt();
            }
        }
        final int numStops = sc.nextInt();                        // 経由する駅の数
        final int[][] routeList = new int[numStops][2];           // ルート
        for(int i = 0; i < numStops; i++) {
            for(int j = 0; j < 2; j++) {
                routeList[i][j] = sc.nextInt();
            }
        }
        int prevRoute = routeList[0][0] - 1;                      // 前の路線
        int prevStation = routeList[0][1] - 1;                    // 前の駅
        int curtRoute;                                            // 現在の路線
        int curtStation;                                          // 現在の駅
        int price = priceList[prevRoute][prevStation];            // 料金
        for(int i = 1; i < numStops; i++) {
            curtRoute = routeList[i][0] - 1;
            curtStation = routeList[i][1] - 1;
            // 駅番号が異なる場合は料金が発生する
            if(prevStation != curtStation) {
                price += Math.abs(priceList[curtRoute][prevStation] - priceList[curtRoute][curtStation]);
            }
            // 現在の路線と駅を保存
            prevRoute = curtRoute;
            prevStation = curtStation;
        }
        System.out.println(price);
    }
}