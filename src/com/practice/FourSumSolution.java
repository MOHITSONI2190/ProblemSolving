package com.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSumSolution {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list= new ArrayList<>();

        Arrays.sort(nums);   //nlogn
         for(int i =0; i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;//if duplicate elments are found
            }

            for(int j=i+1;j<nums.length;j++){
                if (j != i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int left_pointer=j+1;
                int right_pointer=nums.length;
                while(left_pointer<right_pointer){
                    int currSum=nums[i]+nums[j]+nums[left_pointer]+nums[right_pointer];
                    if(currSum==target){
                        list.add(Arrays.asList(nums[i],nums[j],nums[left_pointer],nums[right_pointer]));
                        left_pointer++;
                        right_pointer--;
                        // Check for skipping duplicates
                        while (left_pointer < right_pointer && nums[left_pointer] == nums[left_pointer - 1]) {
                            left_pointer++;
                        }
                        while (left_pointer < right_pointer && nums[right_pointer] == nums[right_pointer + 1]) {
                            right_pointer--;
                        }
                    }else if(currSum<target){
                        left_pointer++;
                    }else{
                        right_pointer --;
                    }
                }
            }
         }
         return list;
    }
}
