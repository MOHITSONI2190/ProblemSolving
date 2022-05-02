package com.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoCityScheduling {

    /*https://leetcode.com/problems/two-city-scheduling/


     */

    public int twoCitySchedCost(int[][] costs) {
        int len = costs.length;
        int [] diff = new int[len];
        int res=0;
        for(int i=0;i<len;i++){
            diff[i]=costs[i][0]-costs[i][1];
            res+=costs[i][0];
        }
        Arrays.sort(diff);
        for(int i=0;i<len/2;i++){
            res+=diff[i];
        }
        return res;
    }
}
