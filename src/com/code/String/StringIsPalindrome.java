package com.code.String;

import java.util.Scanner;

public class StringIsPalindrome {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner s = new Scanner(System.in);
        // System.out.println("Enter the number of string test cases");
        int numberOfTestCases=s.nextInt();
        s.nextLine();
        while(numberOfTestCases>0)
        {
            String a;
            a = s.nextLine();
//            if(isPaindrome(a))
//            {
//                System.out.println("1");
//            }
//            else
//            {
//                System.out.println("0");
//            }
            System.out.println(isPaindrome2(a));
            numberOfTestCases--;
        }
    }
    static boolean isPaindrome(String A)
    {
        int i=0,j=A.length()-1;
        while(i<j)
        {
            if(A.charAt(i)!=A.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static int isPaindrome2(String A)
    {
        int count=0;
        int i=0,j=A.length()-1;
        while(i<j)
        {
            if(A.charAt(i)!=A.charAt(j))
            {
                count=count+2;
            }
            i++;
            j--;
        }

        if(isPaindrome(A))
            return 0;
        else
            return count;
    }

}
