import java.util.*;

public class Main{
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        final int H = sc.nextInt();
        final int W = sc.nextInt();

        var imgs = new int[2][2*H][2*W];
        var resultImg = new int[2*H-1][2*W-1];

        //画像読み込み, 拡大
        int _input;
        for(int i = 0; i < 2; i++){
            for (int j = 0; j < H; j++) {
                for (int k = 0; k < W; k++) {
                    _input = sc.nextInt();
                    for(int y = 0; y < 2; y++)  for(int x = 0; x < 2; x++){
                        imgs[i][2*j+y][2*k+x] = _input;
                    }
                }
            }
        }
        
        //合成
        for (int j = 0; j < resultImg.length; j++) {
            for (int k = 0; k < resultImg[0].length; k++) {
                resultImg[j][k] = (imgs[0][j+1][k+1] + imgs[1][j][k]) / 2;
            }
        }

        // 出力
        String _result;
        for(int i = 0; i < resultImg.length; i++){            
            _result = Arrays.toString(resultImg[i]);
            _result = _result.substring(1, _result.length()-1).replaceAll(",","");
            System.out.println(_result);
        }

        sc.close();
    }
}
// 元のコード(Main_beforeFix.java)が読みづらかったため、保持するデータを増やすことで少し解消しました。