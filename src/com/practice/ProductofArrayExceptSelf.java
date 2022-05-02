package com.practice;

public class ProductofArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
      int [] left = new int[nums.length];
      int [] right = new int[nums.length];


      for(int i=0, j=nums.length-1; i<nums.length-1;i++, j--){
          if(i==0){
              left[i]= nums[i];
              right[j]=nums[j];
          }
          else{
              left[i]=left[i-1]*nums[i];
              right[j]=right[j+1]*nums[j];
          }
      }


      for(int i =0;i<nums.length;i++){
          if(i==0){
              nums[i]=right[1];
          }else if(i==nums.length-1){
              nums[i]=left[i-1];
          }else{
              nums[i]=left[i-1]*right[i+1];
          }
      }

      return nums;
    }


}
