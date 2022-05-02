package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shift2DGrid {
    /**
     * https://leetcode.com/problems/shift-2d-grid/
     */
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int rows = grid.length;
        int cols = grid[0].length;
        int len= rows*cols;
        List<List<Integer>> outputGrid = new ArrayList<>();
        Integer [][] shiftedGrid = new Integer[rows][cols];
        int [] linearArr = new int[len];

        for(int i =0;i<rows;i++){
            for(int j=0;j<cols;j++){
                  int linearPosition = (i*cols+j +k)%len;
                  linearArr[linearPosition]= grid[i][j];
                  int rowIndex = linearPosition/cols;
                  int colIndex= linearPosition%cols;
                  shiftedGrid[rowIndex][colIndex]= grid[i][j];
            }
        }

        for (int i = 0; i < rows; i++) {
            outputGrid.add(Arrays.asList(shiftedGrid[i]));
        }
        return outputGrid;

    }
}
