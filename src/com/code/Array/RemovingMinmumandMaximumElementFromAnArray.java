package com.code.Array;


public class RemovingMinmumandMaximumElementFromAnArray {

    static class Index
    {
        int minIndex;
        int maxIndex;
    }
    public static Index minmumAndMaximum(int [] array,int arraySize)
    {
        int max;
        int min;
        Index ind=new Index();
        if(arraySize==1)
        {
            ind.minIndex=0;
            ind.maxIndex=0;
            return ind;
        }
        if(array[0]>array[1])
        {
            max=array[0];
            min=array[1];
            ind.maxIndex=0;
            ind.minIndex=1;
        }
        else{
            max=array[1];
            min=array[0];
            ind.minIndex=0;
            ind.maxIndex=1;
        }

        for(int i=2;i<arraySize;i++)
        {
            if(array[i]>max)
            {
                ind.maxIndex=i;
                max=array[i];

            }else if(array[i]<min)
            {
                ind.minIndex=i;
                min=array[i];
            }
        }
        return ind;
    }

    public static void main(String[] args) {
        int arraySize=8;

        int[] array=new int[]{2,10,7,5,4,1,8,6};
        Index indx=minmumAndMaximum(array,arraySize);

//        int diff1=Math.min(indx.maxIndex,Math.abs(indx.maxIndex-(arraySize-1)));
//        int diff2=Math.min(indx.minIndex, Math.abs(indx.minIndex-(arraySize-1)));
        if(indx.minIndex>indx.maxIndex)
        {
            int temp= indx.minIndex;
            indx.minIndex=indx.maxIndex;
            indx.maxIndex=temp;
        }
//        int mimumOperation=diff1+diff2+2;
//        if(mimumOperation==0)
//        {
//            mimumOperation=mimumOperation+1;
//        }
//        System.out.println(indx.maxIndex+"and diff is ->"+diff1);
//        System.out.println(indx.minIndex+"and diff is ->"+diff2);
//        System.out.println("MinimumOperations "+mimumOperation);
        int minimumOperation=Math.min(indx.maxIndex+1,Math.min(arraySize- indx.minIndex, indx.minIndex+1+arraySize- indx.maxIndex));


    }

}
