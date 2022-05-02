package com.practice;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {

        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                continue;
            }else{
                int j=i;
                while(j< nums.length-1 && nums[j]==0){
                    j++;
                }
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }

    }


    public static void main(String[] args) {
        int[] nums = {0};
        moveZeroes(nums);
        for(int num : nums){
            System.out.print(num+" ");
        }
    }
}
