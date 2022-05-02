package com.practice;

import java.util.List;

public class MaximumSubarraySum {

    public static long maximumSum(List<Long> a, long m) {
        // Write your code here
        Long maxMod=0L;
        for(int i =0; i< a.size();i++){
            long sum=0L;
            for(int j=i;j<a.size();j++){
                sum+=a.get(j);
                if(sum%m > maxMod){
                    maxMod = sum%m;
                }
            }
        }

        return maxMod;


    }

}
