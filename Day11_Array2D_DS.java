//Question in Bottom of code
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day11_Array2D_DS {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int[] a=new int[16];
        int c=0,i,j,k;
        for(i=0;i<12;i++)
        {
            a[i]=0;
        }
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                for(k=j;k<j+3;k++)
                {
                    a[c]+=arr[i][k];
                }
                a[c]+=arr[i+1][k-2];                               //k value is because loop ends iff 1 number increase then check and exit so k decrement by 1 extra number
                a[c]+=arr[i+2][k-3]+arr[i+2][k-2]+arr[i+2][k-1];
                c++;
            }
        }
        int max=a[0];
        for(i=0;i<16;i++)
        {
        max=Math.max(max,a[i]);
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
        for(int j=0;j<6;j++)
        {
            arr[i][j]=scanner.nextInt();
        }
        }

        int result = hourglassSum(arr);
        System.out.println("Largest Number:"+result);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
/*
Question:
Given a 6x6 2D Array, arr:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
We define an hourglass in A to be a subset of values with indices falling in this pattern in arr's
graphical representation:

a b c
  d
e f g
There are 16 hourglasses in arr, and an hourglass sum is the sum of an hourglass' values. 
Calculate the hourglass sum for every hourglass in arr, then print the maximum hourglass sum.

For example, given the 2D array:

-9 -9 -9  1 1 1 
 0 -9  0  4 3 2
-9 -9 -9  1 2 3
 0  0  8  6 6 0
 0  0  0 -2 0 0
 0  0  1  2 4 0
We calculate the following 16 hourglass values:

-63, -34, -9, 12, 
-10, 0, 28, 23, 
-27, -11, -2, 10, 
9, 17, 25, 18
Our highest hourglass value is 28 from the hourglass:

0 4 3
  1
8 6 6
Function Description:

Complete the function hourglassSum in the editor below. It should return an integer,
the maximum hourglass sum in the array.

hourglassSum has the following parameter(s):

arr: an array of integers
Input Format

Each of the 6 lines of inputs arr[i] contains 6 space-separated integers arr[i][j].

Constraints:
1.-9<=arr[i][j]<=9
2.0<=i,j<=5

Output Format:

Print the largest (maximum) hourglass sum found in arr.

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
Sample Output
19

Explanation
arr contains the following hourglasses:
1 1 1   1 1 0   1 0 0   0 0 0
  1       0       0       0
1 1 1   1 1 0   1 0 0   0 0 0

0 1 0   1 0 0   0 0 0   0 0 0
  1       1       0       0
0 0 2   0 2 4   2 4 4   4 4 0

1 1 1   1 1 0   1 0 0   0 0 0
  1       2       4       4
0 0 0   0 0 2   0 2 0   2 0 0

0 0 2   0 2 4   2 4 4   4 4 0
  0       0       2       0
0 0 1   0 1 2   1 2 4   2 4 0

The hourglass with the maximum sum (19) is:

2 4 4
  2
1 2 4
*/
