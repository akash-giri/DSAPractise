package com.code.Array;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            else{
                digits[i]=0;
            }
        }
        if(digits[0]==0){
            int[] output=new int[digits.length+1];
            output[0]=1;
            return output;
        }
        else{
            return digits;
        }
    }


    public static void main(String[] args) {
      int [] array= plusOne(new int[]{9});
      for(int i=0;i<array.length;i++){
          System.out.print(array[i]+" ");
      }
    }

}
