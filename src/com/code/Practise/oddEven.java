package com.code.Practise;

import java.util.Scanner;

public class oddEven {

    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter first Name");
//        String firstName=sc.next();
//        System.out.println(firstName);
//        int firstnumber=sc.nextInt();
//
//        System.out.println("Enter second number");
//        int secondnumber=sc.nextInt();
//        int sum=firstnumber+secondnumber;
//        System.out.println(sum);



//        int number=45;
//        if(45%2==0)
//        {
//            System.out.println("number is even");
//        }else{
//            System.out.println("number is odd");
//        }
//        int number=20;
//        //Switch expression
//        switch(number){
//            //Case statements
//            case 10: System.out.println("10");
//                break;
//            case 20: System.out.println("20");
//                break;
//            case 30: System.out.println("30");
//                break;
//            //Default case statement
//            default:System.out.println("Not in 10, 20 or 30");
//        }

//        int number=12;
//        for(int i=number;i<11;i++)
//        {
//            System.out.println(i);
//        }

//        while(number<11)
//        {
//            System.out.println(number);
//           number++;
//        }
//        do{
//            System.out.println(number);
//            number++;
//        }while(number<11);
        /**
         * 1.Take values of length and breadth of a rectangle from user and check if it is square or not.
         */
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the length");
//        int length=sc.nextInt();
//        System.out.println("Enter the breadth");
//        int breadth=sc.nextInt();
//        if(length==breadth)
//        {
//            System.out.println("this is square");
//        }
//        else {
//            System.out.println("this is a rectangle");
//        }

        /**
         * 2.Take two int values from user and print greatest among them
         */
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the first value");
//        int first=sc.nextInt();
//        System.out.println("enter the second value");
//        int second=sc.nextInt();
//        if(first>second)
//        {
//            System.out.println(first +"is greatest");
//        }
//        else
//        {
//            System.out.println(second +"is greater");
//        }
        /**
         * A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
         * Ask user for quantity
         * Suppose, one unit will cost 100.
         * Judge and print total cost for user.
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the quantity");
        int quantity=sc.nextInt();
        int costPrice=quantity*100;
        if(costPrice>1000)
        {
            int discount=costPrice-((costPrice*10)/100);
            System.out.println("total cost "+ discount);
        }
        else{
            System.out.println(costPrice);
        }

    }
}

