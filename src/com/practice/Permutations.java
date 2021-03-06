package com.practice;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        findAll(0,nums, result);

        return  result;
    }

    public static void findAll(int start, int [] nums,List<List<Integer>> result ){
        if(start==nums.length-1 ){
            List<Integer> list = new ArrayList<>();
            for(int num : nums){
                    list.add(num);
            }
            result.add(list);
            return;
        }

        for(int i=0; i<nums.length;i++){
            swap(nums, i , start);
            findAll(start+1, nums,result);
            swap(nums, i , start);

        }
    }

    public static void swap(int[] nums, int i, int j){
        int temp= nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
