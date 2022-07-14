package com.code.Array;

public class quicksort {

    public static void main(String[] args) {
       int[] array=new int[]{4, 1, 3, 9, 7};
       int low=0;
       int high= array.length-1;
       quickSort(array,low,high);
       for(int i=0;i< array.length;i++)
       {
           System.out.print(array[i]+" ");
       }
    }
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low<high)
        {
            int pivot=partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        int piv = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high- 1; j++)
        {
            // If current element is smaller than the pivot
            if (arr[j] < piv)
            {
                i++;    // increment index of smaller element
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                // swap arr[i] and arr[j]
            }
        }
        int temp1=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp1;
        return (i + 1);
    }
}
