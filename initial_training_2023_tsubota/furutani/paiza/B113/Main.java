import java.util.*;

public class Main{
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        var field = new LinkedList<Integer>();
        int _currentValue, _insertIndex;

        //左から単調減少する形式で挿入
        for (int i = 0; i < n; i++) {
            _currentValue = sc.nextInt();
            _currentValue = (_currentValue == 2) ? 1:2;     //圧縮(2 -> 1,   4 -> 2)
            
            //挿入位置計算
            _insertIndex = field.indexOf(1);
            if(_insertIndex == -1 || _currentValue == 1){
                _insertIndex = field.size();
            }

            // 挿入, 合成
            field.add(_insertIndex, _currentValue);
            mergeCheck(field, _insertIndex-1, _currentValue);
            System.out.println(_insertIndex);
        }

        sc.close();
    }

    //再帰的に合成
    static void mergeCheck(LinkedList<Integer> field, int removeIndex, int currentValue){
        if(removeIndex < 0 || field.get(removeIndex) != currentValue){
            return;
        }

        field.set(removeIndex+1, ++currentValue);
        field.remove(removeIndex);
        mergeCheck(field, --removeIndex, currentValue);
    }
}