package com.practice;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZeros {

    /*   https://leetcode.com/problems/set-matrix-zeroes/
    * */
    public static void setZeroes(int[][] matrix) {
        int rows= matrix.length;
        int cols = matrix[0].length;
       List<List<Integer>> zeroes = new ArrayList<>();

       for(int i=0; i<rows; i++){
           for(int j =0; i<cols; j++){
               if(matrix[i][j]==0) {
                   List l = new ArrayList();
                   l.add(i);
                   l.add(j);
                   zeroes.add(l);
               }
           }
       }


       for(List l : zeroes){
         int row= (int) l.get(0);
         int col= (int) l.get(1);

         for(int i=0; i<cols; i++){
             matrix[row][i]=0;
         }
         for(int i=0;i<rows;i++){
             matrix[i][col]=0;
         }
       }
    }


    public static void main(String[] args) {
        int [][] matrix =  {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
  //{{1,1,1},{1,0,1},{1,1,1}}
        setZeroes(matrix);

        System.out.println("hello");
    }
}
