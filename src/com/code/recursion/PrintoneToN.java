package com.code.recursion;

public class PrintoneToN {
    static void printNumber(int initial,int last)
    {
       if(initial<=last)
       {
           System.out.println(initial);
            printNumber(initial+1,last);
      }

    }

    public static void main(String[] args) {
        printNumber(1,5);
    }



}
