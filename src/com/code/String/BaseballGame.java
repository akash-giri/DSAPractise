package com.code.String;

public class BaseballGame {
    public static void main(String[] args) {
        String[] s=new String[]{"5","2","C","D","+"};
        System.out.println(calPoints(s));
    }
    public static int calPoints(String[] ops){
        int score=0;
        int prev1=0;
        int prev2=0;
        for(int i=0;i<ops.length;i++)
        {
            if(ops[i]=="D"){
                score+=2*prev1;
                prev2=2*prev1;
            }else if(ops[i]=="C")
            {
                score-=prev2;
                prev2=prev1;
            }
            else if(ops[i]=="+")
            {
                score+=(prev1+prev2);
            }
            else {
                score+=Integer.parseInt(ops[i]);
                prev2=Integer.parseInt(ops[i]);
                if(i>=1)
                {
                    prev1=Integer.parseInt(ops[i-1]);
                }
            }
        }
        return score;
    }
}
