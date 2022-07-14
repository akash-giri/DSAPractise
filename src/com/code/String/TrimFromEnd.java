package com.code.String;

public class TrimFromEnd {
    /**
     * Input 1:
     * A = "**h*e*l*lo*"
     * Input 2:
     * A = "noasteriskhere"
     *
     * Output 1:
     * h*e*l*l*o
     *
     * Output 2:
     * noasteriskhere
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(solve("**h*e*l*l*o*"));
    }
    static String solve(String A)
    {
        String res="";
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)=='*')
            {
                res=A.substring(i+1);
            }else {
                break;
            }
        }
        if(res.equals(""))
        {
            res=A;
        }
        for(int i=res.length()-1;i>=0;--i)
        {
            if(res.charAt(i)=='*')
            {
                res=res.substring(0,res.length()-1);
            }
            else {
                break;
            }
        }
        return res;
    }
}
