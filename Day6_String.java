//Question in bottom
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day6_String {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        String[] s=new String[n];
        String s1="";
        sc.nextLine();
        for(i=0;i<n;i++)
        s[i]=sc.nextLine();
        for(i=0;i<n;i++)
        {
            for(j=0;j<s[i].length();j++)
            {
                if(j%2==0)
                System.out.print(s[i].charAt(j));
                else
                s1=s1+s[i].charAt(j);
            }
            System.out.print(" "+s1);
            System.out.println();
            s1="";
        }
    }
}
/*
Question:
Task 
Given a string, S, of length N that is indexed from 0 to N-1, print its even-indexed 
and odd-indexed characters as  space-separated strings on a single line 

Input Format
The first line contains an integer, T (the number of test cases). 
Each line i of the T subsequent lines contain a String, S.

Constraints
  1.1<=T<=10
  2.2<=length of S<=10000
  
Output Format
For each String  S[j](where 0<=j<=T-1),print S[j]'s even-indexed characters,
followed by a space, followed by S[j]'s odd-indexed characters.

Sample Input
2
Hacker
Rank

Sample Output
Hce akr
Rn ak
*/
