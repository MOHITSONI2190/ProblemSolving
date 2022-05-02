package com.practice;

public class SearchInRotatedArray {

    /*
      https://leetcode.com/problems/search-in-rotated-sorted-array/  */
    public static int search(int[] nums, int target) {
        int low=0;
        int high=nums.length;

        return binarySearch(nums,low,high,target);

    }

    public static int binarySearch(int[] nums, int low, int high, int key){
    if(low>high)
        return -1;

    int mid= (low+high)/2;
    if(key==nums[mid]){ return mid;}

    if(nums[low]<=nums[mid]){
        if(key>=nums[low]&& key<=nums[mid]){
          return  binarySearch(nums,low,mid-1,key);
        }
     return  binarySearch(nums,mid+1,high, key);
    }
        if(key>=nums[low]&& key<=nums[mid]){
            return  binarySearch(nums,low,mid-1,key);
        }
        return  binarySearch(nums,mid+1,high, key);
    }

    public static void main(String[] args) {
       int[] nums = {5,6,7,8,9,11,1,2,3,4};
     System.out.print(   SearchInRotatedArray.search(nums,2));

    }
}
