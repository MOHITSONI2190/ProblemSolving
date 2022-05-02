package com.practice;

import java.util.*;
import java.util.stream.Collectors;

public class DeleteAndEarn {

    public static int deleteAndEarnSol(int[] nums) {
      int[] freq = new int[10001];

      for(int num : nums){
          freq[num]++;
      }

      int[] dp = new int[10001];
      int max= dp[10000];

      dp[0]=0;
      dp[1]= freq[1];

      for(int i=2;i<dp.length;i++){
          dp[i] = Math.max(dp[i-1], freq[i]*i+dp[i-2]);
          max= Math.max(max, dp[i]);
      }
        return max;
    }


    public static void main(String[] args) {
        int[] nums ={2,2,3,3,3,4};
        System.out.println(deleteAndEarnSol(nums));
    }
}
