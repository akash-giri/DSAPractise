package com.code.StackAndQueue;

import java.util.ArrayList;
import java.util.List;

public class BuildAnArrayWithStackOperations {

    public static void main(String[] args) {
        int[] tagt=new int[]{1,4};
        int number=4;
        List<String>str=buildArray(tagt,number);
        System.out.println(str.toString());
    }
    public static List<String> buildArray(int[] target, int n) {

        List<String> ans = new ArrayList<>();
        int k =1;
        for(int i=0;i<target.length;i++){
            if(target[i] == k++){
                ans.add("Push");
            }
            else{
                ans.add("Push");
                ans.add("Pop");
                i = i-1;
            }
        }
        return ans;
    }
}
