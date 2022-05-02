package com.practice;

import java.util.ArrayList;
import java.util.List;

public class Subset {

    /**
     * https://leetcode.com/problems/subsets/
     */

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateList(0, nums, new ArrayList<>(),result);

        return result;
    }
    public static void generateList(int index, int[] nums, List<Integer> currList, List<List<Integer>> resultList){
          resultList.add(new ArrayList<>(currList));
        System.out.println(index +" : "+currList);

          for(int i=index;i<nums.length;i++){

              currList.add(nums[i]);

              generateList(i+1,nums,currList, resultList);
              currList.remove(currList.size()-1);
          }
    }

    public static void main(String[] args) {
        int[] nums={1,2,3};

        System.out.println(subsets(nums));
       // System.out.println(Math.pow(2,10));
    }


}
