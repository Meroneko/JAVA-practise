import java.util.*;

public class Main{
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        var basePitch = new ArrayList<Integer>();
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            basePitch.add(sc.nextInt());
        }

        int maxScore = 0;
        int _score, _diff, _currentPitch;
        for (int i = 0; i < n; i++) {
            _score = 100;
            for (int j = 0; j < m; j++) {
                _currentPitch = sc.nextInt();
                int diff = Math.abs(basePitch.get(j) - _currentPitch);

                if(diff <= 5)           continue;
                else if(diff <= 10)     _score -= 1;
                else if(diff <= 20)     _score -= 2;
                else if(diff <= 30)     _score -= 3;
                else                    _score -= 5;
            }

            if(maxScore < _score){
                maxScore = _score;
            }
        }

        System.out.println(maxScore);

        sc.close();
    }
}