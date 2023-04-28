import java.util.*;
import java.util.stream.*;

public class Main{

    public static void main(String[] args){
        var sc = new Scanner(System.in);

        var mp = new HashMap<String, String>();
        mp.put("A","4");
        mp.put("E","3");
        mp.put("G","6");
        mp.put("I","1");
        mp.put("O","0");
        mp.put("S","5");
        mp.put("Z","2");
        
        String s = sc.next();
        for(var key: mp.keySet()){
            s = s.replaceAll(key, mp.get(key));
        }
        System.out.println(s);

        sc.close();
    }
}