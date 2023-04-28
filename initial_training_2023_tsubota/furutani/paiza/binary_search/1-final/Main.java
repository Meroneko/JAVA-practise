import java.util.*;

public class Main{

    public static final Comparator<Integer> lower = (x, y) -> x.compareTo(y) >= 0 ? 1 : -1;
    public static final Comparator<Integer> upper = (x, y) -> x.compareTo(y) > 0 ? 1 : -1;

    public static void main(String[] args){
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        var list = new ArrayList<Integer>();
        for(int i = 0; i < n; i++)  list.add(sc.nextInt());
        Collections.sort(list);
        
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            int lnum = sc.nextInt();
            int rnum = sc.nextInt();

            int l = ~Collections.binarySearch(list, lnum, lower);
            int r = ~Collections.binarySearch(list, rnum, upper);
            System.out.println(r-l);
        }
        
        sc.close();
    }
}