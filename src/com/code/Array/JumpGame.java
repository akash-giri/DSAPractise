package com.code.Array;

public class JumpGame {

    public static void main(String[] args) {
        if(jumpGame(new int[]{3,2,1,0,4}))
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    static boolean jumpGame(int [] nums)
    {
        int goal = nums.length-1;
        for(int i=nums.length-1; i>=0; i--) {
            if(i + nums[i] >= goal) {
                goal = i;
            }
        }
        return goal == 0 ? true : false;
    }
}
