package ProtectedPac;

import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    private final static Scanner sc=new Scanner(System.in);

    static {

    }

    public static void main(String[] args)
    {
        int n=sc.nextInt();
       sc.skip("a");
         System.out.println(n);
         if (n>=1 && n<=100)
         {
             if (n%2==0)
             {
                 System.out.println("weird");
             }
             if (n%2==0 && n<=5 || n>=2)
             {
                 System.out.println("Not weird");
             }
             if (n%2==0 && n<=20 || n>=6)
             {
                 System.out.println(" weird");
             }
         }
         sc.close();
        String s1 = "";


    }





}
