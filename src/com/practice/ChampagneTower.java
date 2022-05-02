package com.practice;

public class ChampagneTower {

    /*
    https://leetcode.com/problems/champagne-tower/
     */
    public static double champagneTowerSol(int poured, int query_row, int query_glass) {

           double [][] arr= new double[query_row+2][query_row+2];
           arr[0][0]=(double)poured;

              for(int i=0; i<=query_row; i++){

                  for(int j=0;j<query_glass;j++){
                      double temp =(arr[i][j]-1)/2;
                      if(temp>0) {
                          arr[i + 1][j] += temp;
                          arr[i + 1][j + 1] += temp;
                      }
                  }
              }

          return Math.min(1,arr[query_row][query_glass]);
    }


    public static void main(String[] args) {
    System.out.println(champagneTowerSol(100000009,33,17));
    }
}
