package com.code.Array;

public class MoveAllNegativeNumberToOneSideInArray {
    public static void negativeNumberMoveToStartOfArray(int []arr,int size){
        int j=0,temp;
        for(int i=0;i<size;i++){
            if(arr[i]<0){
                if(i!=j){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

    /**
     * if order is not important then we can do in this way also
     * input->-12,11,-13,-5,6,-7,5,-3,-6
     * output>-12,-6,-13,-5,-3,-7,5,6,11
     */
    public void negativeNumberToBegOfArray(int arr[],int size)
    {
        int i=0;int j=size-1;
        while(i<j)
        {
            if(arr[i]<0)
                i++;
            else if(arr[j]>0)
                j--;
            else
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr=new int[]{1,3,5,-7,-4,-6,11,8,-10};
        int size= arr.length;
        negativeNumberMoveToStartOfArray(arr,size);

    }
}
