package com.code.String;

public class MovePiecesToObtainAString {
    public static void main(String[] args) {
        String str="_L__R__R_";
        String str1="L______RR";
        System.out.println(canChange(str,str1));
    }

    public static boolean canChange(String start, String target) {

        StringBuffer buf = new StringBuffer();
            int i=1;
            while(start.charAt(i)=='L' && start.charAt(i-1)=='_')
            {

                char temp=start.charAt(i);
               start= start.replace(start.charAt(i),start.charAt(i-1));
                start=start.replace(start.charAt(i-1),temp);
                i++;
            }
            int j=1;
            while(start.charAt(j)=='R' && start.charAt(j+1)=='_')
            {
                char temp=start.charAt(j);
               start= start.replace(start.charAt(j),start.charAt(j+1));
               start= start.replace(start.charAt(j+1),temp);
                j++;
            }

        if(start.equals(target))
        {
            return true;
        }
        else{
            return false;
        }
    }
}
