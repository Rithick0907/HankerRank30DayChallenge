//Question in Bottom
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day5_LoopUse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" x "+i+" = "+n*i);
        }
        scanner.close();
    }
}
/*
Question:
Task 
Given an integer, n, print its first 10 multiples. Each multiple n*i (where 1<=i<=10)
should be printed on a new line in the form: n x i = result.

Input Format
A single integer, n.

Constraints
  1.2<=n<=20
  
Output Format
Print 10 lines of output; each line i (where 1<=i<=10) contains the result of n*i in the 
form: n x i = result.

Sample Input
2

Sample Output
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
*/
