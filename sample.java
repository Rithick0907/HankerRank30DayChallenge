package array_in_java;
import java.util.*;

public class sample {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double a=(double)tip_percent;
        double b=(double)tax_percent;
        a=(meal_cost)*(a/100); 
        b=(meal_cost)*(b/100);       
        meal_cost=meal_cost+a+b;
        String c=Double.toString(meal_cost);
        String[] d=c.split("\\.");
        int e;
        if(d[1].charAt(0)=='5'||d[1].charAt(0)=='6'||d[1].charAt(0)=='7'||d[1].charAt(0)=='8'||d[1].charAt(0)=='9')
        {
            e=1;
        }
        else
        {
            e=0;
        }
        tax_percent=Integer.parseInt(d[0]);
        tip_percent=tax_percent+e;
        System.out.println(tip_percent);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}

