package com.practice;

public class MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
         int maxProd= Integer.MIN_VALUE;
         int currMax=1;
         int currMin=1;

         for(int i=0; i<nums.length;i++){
             if(nums[i]==0){
                 currMax=1;
                 currMin=1;
                 maxProd= Math.max(maxProd,currMax);
                         continue;
             }
            int temp=currMax*nums[i];
             currMax=max(currMax*nums[i], currMin*nums[i], nums[i]);
             currMin=min(currMax*nums[i], currMin*nums[i], nums[i]);
             maxProd= Math.max(maxProd,currMax);

         }
        maxProd= Math.max(maxProd,currMax);

         return maxProd;
    }


    public static int max(int a,int b, int c ){
        int m= a>b ? a:b;
        m= m>c? m : c;
        return m;
    }
    public  static int min(int a,int b, int c ){
        int m= a<b ? a:b;
        m= m<c? m : c;
        return m;
    }

    public static void main(String[] args) {
        int[]nums = {-2,0,-1};
        System.out.println(maxProduct(nums));
    }
}
