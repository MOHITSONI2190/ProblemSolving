package com.practice;

public class NextPermutation {
/*
https://leetcode.com/problems/next-permutation/
 */
    public static void  nextP(int[] nums) {
        int index=-1;
        for(int i=nums.length-1; i>0;i--){
            if (nums[i]>nums[i-1]) {
                index= i-1;
                break;
            }
        }

        if(index==-1){
            //revers the number
            reverse(nums,0, nums.length-1);
            return;
        }

        int j=-1;
        for(int i=nums.length-1;i>index;i--){
            if(nums[i]>nums[index]){
               j=i;
               break;
            }
        }

          swap(nums,index,j);
          reverse(nums,index+1,nums.length-1);

    }

    public static void  swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void reverse(int[] nums, int i, int j){
        while(i<j){
            swap(nums,i,j);
            i++; j--;
        }

    }


    public static void main(String[] args) {
        int[] nums ={3,2,1};
  NextPermutation.nextP(nums);
  System.out.print(nums);
    }
}