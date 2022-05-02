package com.practice;

public class JumGame {
    public static boolean canJump(int[] nums) {
        int len= nums.length;
        int[] jump = new int[len];
        jump[len-1]=1;

        for(int i=len-2; i>=0; i--){
            int x= nums[i]+i;
            if(x>=len-1){
                jump[i]=1;
                continue;
            }
            for(int j=i+1;j<Math.min(x,len-1); j++){
                if(jump[j]==1){
                    jump[i] =1;
                    continue;
                }
            }
        }
        if(jump[0]==1){
            return true;
        }else
            return false;

    }

    public static void main(String[] args) {
        int [] nums = {1,2,3};

        System.out.print( canJump(nums));
    }
}
