package com.practice;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int []> outputList= new ArrayList<>();
        if(intervals.length==0){
            outputList.add(newInterval);
        }
        int isMerge=0;

        int newInterval_begin=newInterval[0];
        int newInterval_end= newInterval[1];
        for(int i =0; i<intervals.length;i++){
            int[] currentInterval = intervals[i];
            int curr_begin= intervals[i][0];
            int curr_end= intervals[i][1];

            if(newInterval_begin>=curr_end){
                outputList.add(currentInterval);
            } else if(newInterval_begin<curr_begin && newInterval_end<curr_begin){
                isMerge=1;
                outputList.add(newInterval);
                outputList.add(currentInterval);
            }
            else{
                isMerge=1;
               currentInterval[0]= Math.min(newInterval_begin, curr_begin);

               while(i<intervals.length-1 && newInterval_end>= intervals[i][0]){
                   currentInterval[1]= Math.max(newInterval_end, intervals[i][1]);
                   newInterval_end=currentInterval[1];
                   i++;
               }
               //i--;
                outputList.add(currentInterval);

                for(int j =i; j<intervals.length;j++){
                    outputList.add(intervals[j]);
                }
                break;
            }

        }
        if(isMerge==0){
            outputList.add(newInterval);
        }

        return outputList.toArray(new int[outputList.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals =  {{1,5}};
        int [] newInterval ={5,7};
        insert(intervals,newInterval);

    }
}
