package com.practice;

import java.util.ArrayList;
import java.util.List;

public class SubsetII {

    /**
     * https://leetcode.com/problems/subsets-ii/
     */

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        int len = nums.length;
        List<Integer> firstList = new ArrayList();
        res.add(firstList);

        for(int i=0; i<len; i++){
            List<Integer> list = new ArrayList();
            for(int j=i; j<len; j++){
                list.add(nums[j]);
                List<Integer> l = new ArrayList(list);
                res.add(l);
            }

        }
        return res;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,2};

     System.out.println(subsetsWithDup(nums));
    }
}
