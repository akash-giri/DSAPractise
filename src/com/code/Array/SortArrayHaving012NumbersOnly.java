package com.code.Array;

public class SortArrayHaving012NumbersOnly {

    public void sort(int[]arr,int size){
        int count1=0,count2=0,count3=0;
        for(int i=0;i<size;i++){
            if(arr[i]==0){
                count1++;
            }
            else if(arr[i]==1){
                count2++;
            }
            else{
                count3++;
            }
        }
        int i=0;
        while(count1>0){
            arr[i++]=0;
            count1--;
        }
        while(count2>0){
            arr[i++]=1;
            count2--;
        }
        while(count3>0){
            arr[i++]=3;
            count3--;
        }
    }
}
