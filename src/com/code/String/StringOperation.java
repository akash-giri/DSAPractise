package com.code.String;

public class StringOperation {

    public static void main(String[] args) {
       String s="AbcaZeoB";
        System.out.println(solve(s));
    }

    static String solve(String A)
    {
        String str=A+A;
        StringBuilder st=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(!(str.charAt(i)>='A' &&str.charAt(i)<='Z'))
            {
                st.append(str.charAt(i));
            }
        }
        for(int i=0;i<st.length();i++)
        {
            if(st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u')
            {
                st.setCharAt(i,'#');
            }
        }
        return st.toString();

    }
}
