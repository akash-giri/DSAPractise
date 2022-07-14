package com.code.recursion;

public class EasyPower {

    static double easyPower(double x,int y)
    {
        if(y==0)
        {
            return 0;
        }
        if(y<0)
        {
            return x+easyPower(x,y+1);
        }
        else{
            return x+easyPower(x,y-1);
        }
    }

    static double powerFunctionLogarithmic(double x,int n)
    {
        if(n==0)
            return 1;

        double xn;
        if(n<0) {
            double xy1 = powerFunctionLogarithmic(x,n/2);
            xn = xy1*xy1;
            if(n%2!=0)
                xn/=x;
        }
        else {
            double xy1 = powerFunctionLogarithmic(x,n/2);
            xn = xy1*xy1;
            if(n%2!=0)
                xn*=x;
        }
        return xn;
    }

    static double powerFunction1(double x,int y)
    {
        if(y==0)
        {
            return 1;
        }
        double xn;
        if(y<0)
        {
            double xy1=powerFunction1(x,y+1);
            xn=xy1/x;
            return xn;

        }
        else{
            double xy1=powerFunction1(x,y-1);
            xn=x*xy1;
            return xn;
        }
    }

    public static void main(String[] args) {
        System.out.println(powerFunctionLogarithmic(2.00000,-2));
    }
}
