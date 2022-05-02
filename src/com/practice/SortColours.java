package com.practice;

public class SortColours {

    public static void sortColors(int[] nums) {

        int low=0;
        int mid=0;
        int high = nums.length-1;



        while(mid<=high){

            if(nums[mid]==0){
                swap(nums,mid, low);
                mid++; low++;
            }else if(nums[mid]==1){
               mid++;
            }else{
                swap(nums,mid,high);
                 high--;
            }
        }
    }

    public static void swap(int[]nums, int i ,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,0};

        SortColours.sortColors(nums);

        for(int i : nums){
            System.out.print(i+" ");
        }
    }
}
