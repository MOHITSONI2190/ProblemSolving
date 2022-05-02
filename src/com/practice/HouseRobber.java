package com.practice;

public class HouseRobber {
    public static int rob(int[] nums) {  int n = nums.length;
        if(n==1){
            return nums[0];
        }

        int rob1=0;
        int rob2=0;

        for(int i =0; i<n; i++){
            int newRob = Math.max(nums[i]+rob1, rob2);
            rob1=rob2;
            rob2= newRob;
        }

        return rob2;
    }

    public static void main(String[] args) {
        int [] nums = {2,7,9,3,1};
        System.out.println(rob(nums));
    }

}
