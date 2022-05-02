package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
 /* https://leetcode.com/problems/combination-sum/ */
    public static List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        ArrayList<Integer> temp= new ArrayList<>();

        findNumbers(arr, list, 0, target,0, temp);

        return list;
    }


    public static void findNumbers(int [] arr,  List<List<Integer>> list , int sum, int targetSum, int index, List<Integer> temp){
        if(sum==targetSum){
            list.add(new ArrayList<>(temp));
            return;
        }
        if(sum>targetSum){
            return;
        }

        for(int i=index; i<arr.length;i++){
            if(sum+arr[i]<= targetSum){
                temp.add(arr[i]);
                findNumbers(arr, list, sum+arr[i], targetSum, i, temp);
                temp.remove(new Integer(arr[i]));
            }
        }
    }

    public static void main(String[] args) {
        int [] arr= {2,3, 6,7 };
        List<List<Integer>> list = combinationSum(arr, 7);

        System.out.println(list);
    }
}
