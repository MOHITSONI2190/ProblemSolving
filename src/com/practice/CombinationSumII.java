package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

    public static List<List<Integer>> combinationSum2(int[] arr, int target) {


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
            if(i>index && arr[i]== arr[i-1]){
                continue;
            }

                temp.add(arr[i]);
                findNumbers(arr, list, sum+arr[i], targetSum, i+1, temp);
                temp.remove(new Integer(arr[i]));

        }
    }


    public static void main(String[] args) {
        int [] arr ={2,5,2,1,2};

        System.out.println(combinationSum2(arr, 5));
    }
}
