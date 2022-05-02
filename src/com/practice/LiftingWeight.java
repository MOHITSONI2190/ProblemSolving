package com.practice;

import java.util.List;

public class LiftingWeight {


    public static int weightCapacity(List<Integer> weights, int maxCapacity) {
        // Write your code here

        int maxWeight = calcMaxWeight(maxCapacity, weights, weights.size());
        return maxWeight;
    }


    static int calcMaxWeight(int W, List<Integer> weights, int n)
    {
        if (n == 0 || W == 0)
        {  return 0; }

     if (weights.get(n - 1) > W)
     {  return calcMaxWeight(W, weights, n - 1);
     } else {
         return Math.max(weights.get(n - 1)+ calcMaxWeight(W - weights.get(n - 1), weights, n - 1),
                 calcMaxWeight(W, weights, n - 1));
     }
    }

}

