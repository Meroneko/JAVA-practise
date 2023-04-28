import java.util.*;

public class Main {
    public static void main(String[] args ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int number_store = sc.nextInt();
        int month = sc.nextInt();
        int construction_cost = sc.nextInt();
        int labor_cost = sc.nextInt();
        int unit_profit = sc.nextInt();
        int total_profit = 0;
        int count = 0;
        
        for (int i = 1; i <= number_store; i++) {
            int sales_ramen = sc.nextInt();
            total_profit = sales_ramen * unit_profit - construction_cost - labor_cost * month;
            if (total_profit < 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}