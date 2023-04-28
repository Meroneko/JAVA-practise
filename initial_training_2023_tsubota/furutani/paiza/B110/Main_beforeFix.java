import java.util.*;

public class Main{
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();

        int[][] resultImg = new int[2*h][2*w];

        //1枚目読み込み, 拡大
        int _left, _top, _input;
        for (int i = 0; i < h; i++) {
            _top = 2*i;
            for (int j = 0; j < w; j++) {
                _left = 2*j;
                _input = sc.nextInt();
                for(int y = 0; y < 2; y++)  for(int x = 0; x < 2; x++){
                    resultImg[_top+y][_left+x] = _input;
                }
            }
        }

        // 2枚目読み込み, 合成
        for (int i = 0; i < h; i++) {
            _top = 2*i+1;
            for (int j = 0; j < w; j++) {
                _left = 2*j+1;
                _input = sc.nextInt();

                for(int y = 0; y < 2; y++){
                    if(_top+y >= 2*h) continue;
                    for(int x = 0; x < 2; x++){
                        if(_left+x >= 2*w) continue;
                        resultImg[_top+y][_left+x] = (resultImg[_top+y][_left+x] + _input)/2;
                    }
                }
            }
        }

        // 出力
        for(int i = 0; i < resultImg.length; i++){            
            if(i == 0)  continue;
            for (int j = 0; j < resultImg[0].length; j++) {
                if(j == 0)  continue;
                System.out.print(resultImg[i][j]);
                if(j != resultImg[0].length-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}