import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int H = sc.nextInt();
        final int W = sc.nextInt();
        final int[][][] PICS = new int[2][H * 2][W * 2];                // 2H*2Wの画像2枚
        final int H_HIGH_RES = H * 2 - 1;
        final int W_HIGH_RES = W * 2 - 1;
        final int[][] PIC_HIGH_RES = new int[H_HIGH_RES][W_HIGH_RES];   // 高画質の画像

        // 2枚の画像を2H*2W個のピクセルに分割
        int px;
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < H; j++) {
                for(int k = 0; k < W; k++) {
                    // 入力されたピクセル値を4つのピクセルにコピー
                    px = sc.nextInt();
                    for(int l = 0; l < 2; l++) {
                        for(int m = 0; m < 2; m++) {
                            PICS[i][j * 2 + l][k * 2 + m] = px;
                        }
                    }
                }
            }
        }

        // 高画質画像のピクセル値を求める
        for(int i = 0; i < H_HIGH_RES; i++) {
            for(int j = 0; j < W_HIGH_RES; j++) {
                // 2枚の画像のピクセル値を平均する
                PIC_HIGH_RES[i][j] = (PICS[0][i + 1][j + 1] + PICS[1][i][j]) / 2;
            }
        }

        // 高画質画像のピクセル値を出力
        for(int i = 0; i < H_HIGH_RES; i++) {
            for(int j = 0; j < W_HIGH_RES; j++) {
                if(j != 0) {
                    System.out.print(" ");
                }
                System.out.print(PIC_HIGH_RES[i][j]);
            }
            System.out.println();
        }  
    }
}

// 15～27行目あたりのfor文が深くなっていてわかりにくいような気がします