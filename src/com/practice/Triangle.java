package com.practice;

import sun.nio.cs.ext.MacHebrew;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
 /*
 https://leetcode.com/problems/triangle/
  */
    public static int minimumTotal(List<List<Integer>> triangle) {
       int[]dp= new int[triangle.get(triangle.size()-1).size() +1];

       for(int i =triangle.size()-1;i>=0;i--){
          List<Integer> list = triangle.get(i);
          for(int j=0; j<list.size();j++){
              dp[j]= list.get(j)+ Math.min(dp[j],dp[j+1]);
          }
       }

       return dp[0];

    }

    public static int findMinTotal(List<List<Integer>> triangle, int currLevel, int currIndex, int sum){
        if(currLevel==triangle.size()-1){
            sum+= triangle.get(currLevel).get(currIndex);
            System.out.println("sum :"+sum);
        }
        else{
            sum+=Math.min(findMinTotal(triangle,currLevel+1,currIndex,sum),
                    findMinTotal(triangle,currLevel+1,currIndex+1,sum)
            );
        }

        return sum;
    }


    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        list1.add(2);
        list2.add(3);
        list2.add(4);
        list3.add(6);
        list3.add(5);
        list3.add(7);
        list4.add(4);
        list4.add(1);
        list4.add(8);
        list4.add(3);

        triangle.add(list1);
        triangle.add(list2);
        triangle.add(list3);
        triangle.add(list4);


        System.out.println(minimumTotal(triangle));


    }


}
