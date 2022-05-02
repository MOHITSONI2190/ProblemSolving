package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
       int[][] output= new int[intervals[0].length][];
        Arrays.sort(intervals, (arr1, arr2) -> arr1[0]- arr2[0]);

        List<int [] > outputList= new ArrayList<>();
        int[] currInterval= intervals[0];
        outputList.add(intervals[0]);

        for(int[] interval : intervals){
            int curr_begin= currInterval[0];
            int curr_end= currInterval[1];
            int next_begin = interval[0];
            int next_end = interval[1];

            if(curr_end>=next_begin){
                currInterval[1]= Math.max(curr_end, next_end);
            }else{
                currInterval=interval;
                outputList.add(currInterval);
            }

        }
   return outputList.toArray(new int[outputList.size()][]);
       }


    public static void main(String[] args) {
        int [][] intervals = {{1,3},{8,10},{15,18},{2,6}};
        Arrays.sort(intervals, (arr1, arr2) -> arr1[0]- arr2[0]);
        int [][] mergedInterval =merge(intervals);
        System.out.println(mergedInterval);
    }
}
