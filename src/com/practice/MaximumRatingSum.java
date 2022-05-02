package com.practice;

import java.util.ArrayList;
import java.util.List;

public class MaximumRatingSum {

    public static long maximumSum(List<Integer> arr) {
        // Write your code here

        int len = 0;
        int currMax = arr.get(0);
        int overallMax = arr.get(0);
        int maxSum=0;

        //doing a prefix sum... an array which stores sum.
        // at i, j of prefix sum .. it store sum of sub matrix ixj of the array arr
        for (int i = 1; i < arr.size(); ++i)
        {
            currMax = Math.max(arr.get(i),
                    arr.get(i) + currMax);


            if (currMax > overallMax)
            {
                overallMax = currMax;
                len = i;
            }
        }
        int startIndex = len;

        while (startIndex >= 0)
        {
            overallMax -= arr.get(startIndex);

            if (overallMax == 0)
                break;

            startIndex--;
        }

        for(int i = startIndex; i <= len && i<arr.size(); ++i)
        {
           maxSum+=arr.get(i);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        List<Integer> a= new ArrayList();
        a.add(4);
        a.add(-1);
        a.add(-2);
        a.add(1);
        a.add(3);
        System.out.println(MaximumRatingSum.maximumSum(a));
    }

}

