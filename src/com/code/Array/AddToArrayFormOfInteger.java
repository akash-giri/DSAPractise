package com.code.Array;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AddToArrayFormOfInteger {

    public static void main(String[] args) {
        //String s="12630717197566440063";
   //     BigInteger bigIntegerStr=new BigInteger(s);
//long l=Long.parseLong(s);
  //      System.out.println(bigIntegerStr);
       int[] nums={1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        int k=516;
        List<Integer>l=addToArrayForm(nums,k);
       System.out.println(l);
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {


        List<Integer> lst= new ArrayList<Integer>();

        long sum=0;
        String s="";
        for(int i=0;i<num.length;i++)
        {
            s+=String.valueOf(num[i]);
        }
         sum=Long.parseLong(s)+k;
        long val=sum;
        int count=0;
        while(val>0)
        {
            val =val/10;
            count++;
        }
        while(sum>0)
        {
            long rem=sum%10;
            lst.add(0, (int) rem);
            count=count-1;
            sum=sum/10;

        }
        Collections.reverse(lst);
        return lst;
    }
    public List<Integer> addToArrayForm1(int[] num, int k) {

        String s="";
        for(int i=0;i<num.length;i++){
            s=s+Integer.toString(num[i]);
        }
        BigInteger bg=new BigInteger(s);
        String s1=Integer.toString(k);
        BigInteger bg1=new BigInteger(s1);
        BigInteger bg2=bg.add(bg1);
        // System.out.println(bg2);
        String s2=bg2.toString();
        char ch[]=s2.toCharArray();
        List al=new ArrayList<>();
        for(int i=0;i<ch.length;i++){
            int j=Integer.parseInt(Character.toString(ch[i]));
            al.add(j);
        }
        return al;
    }
}
