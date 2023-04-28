import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int cardParent1 = sc.nextInt();
        final int cardParent2 = sc.nextInt();
        final int numCardChild = sc.nextInt();
        for(int i = 0; i < numCardChild; i++) {
            final int cardChild1 = sc.nextInt();
            final int cardchild2 = sc.nextInt();
            boolean isHigher;  // 親カードの方が強いかどうか
            if(cardParent1 == cardChild1) {
                isHigher = cardParent2 < cardchild2;
            }
            else {
                isHigher = cardParent1 > cardChild1;
            }
            // 出力
            /*
              TODO 分岐条件がシンプルで、各分岐違いが引数のみの場合、
              三元運算子を使ってみましょう。
              System.out.println(isHigher ? "High" : "Low");
            */
            System.out.println(isHigher ? "High" : "Low");
            // 元のコード
            // if(isHigher) {
            //     System.out.println("High");
            // }
            // else {
            //     System.out.println("Low");
            // }
        }
    }
}

// 変数名の付け方が正しいかどうかも教えていただけると幸いです
/* TODO
  finalのみ付けた変数は大文字にする必要はなく、
  通常のキャメルケースで結構です。
  final staticの定数の場合は大文字のスネークケースにしましょう。
 */

// 承知いたしました。ご回答いただきありがとうございます。