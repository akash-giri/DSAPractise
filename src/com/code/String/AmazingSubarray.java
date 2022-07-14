package com.code.String;

public class AmazingSubarray {

    public static void main(String[] args) {

        String A="ABEC";
        System.out.println(solve(A));
    }
    public static int solve(String A) {

        int count=0;
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)=='a'||A.charAt(i)=='A')
            {
                count+=A.length()-i;
            }else if(A.charAt(i)=='e'||A.charAt(i)=='E')
                count += A.length() - i;
            else if(A.charAt(i)=='i'||A.charAt(i)=='I')
            {
                count+=A.length()-i;
            }
            else if(A.charAt(i)=='o'||A.charAt(i)=='O')
            {
                count+=A.length()-i;
            }
            else if(A.charAt(i)=='u'||A.charAt(i)=='U')
            {
                count+=A.length()-i;
            }
        }
        count=count%10003;
        return count;
    }
}
