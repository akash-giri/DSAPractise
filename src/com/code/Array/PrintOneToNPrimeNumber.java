package com.code.Array;

import java.util.Scanner;

public class PrintOneToNPrimeNumber {
    public static void printDays(int number)
    {
        if(number==1||number==3||number==5||number==7||number==8||number==10||number==12)
        {
            System.out.println(31);
        }else if(number==2)
        {
            System.out.println(28);
        }
        else{
            System.out.println(30);
        }
    }

    public static void pallindromic(int number)
    {
        int reverse=0;
        while(number>0)
        {
            int rem=number%10;
            reverse=reverse*10+rem;
            number=number/10;
        }
        if(number==reverse)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
       // int input=sc.nextInt();
       // char intt=sc.next();
       // pallindromic(input);

       // printDays(input);
//        for(int i=2;i<=input;i++)
//        {
//           if(primeNumber(i))
//           {
//               System.out.println(i);
//           }
//        }
    }
    public static Boolean primeNumber(int number)
    {
        for(int i=2;i<=number/2;i++)
        {
            if(number%i==0)
            {
                return false;
            }
        }
        return true;
    }


}
