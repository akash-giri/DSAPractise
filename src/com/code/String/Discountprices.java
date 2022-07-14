package com.code.String;

public class Discountprices {

    public static void main(String[] args) {
        String str="there are $1 $2 and 5$ candies in the shop";
        int discount=50;
        System.out.println(discountPrices(str,50));
    }

    public static String discountPrices(String sentence, int discount) {
        String[] sen = sentence.split(" ");
        for(int i=0;i<sen.length;i++) {
            if(sen[i].charAt(0)!='$' || sen[i].length()<2) continue;
            long a =0;
            boolean f=true;
            for(int j=1;j<sen[i].length();j++){
                char c =sen[i].charAt(j);
                if(Character.isDigit(c)){
                    a *= 10;
                    a += (c-'0');
                }else{
                    f=false;
                    break;
                }
            }

            if(f){
                double dou = a*0.01*discount;
                dou = (double)a - dou;
                sen[i]="$"+String.format("%.2f", dou);
            }
        }
        return String.join(" ",sen);
    }
}
