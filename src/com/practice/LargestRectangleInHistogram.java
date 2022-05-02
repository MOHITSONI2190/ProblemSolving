package com.practice;

public class LargestRectangleInHistogram {

    public static int largestRectangleArea(int[] heights) {

        if(heights.length==1)  { return heights[0]; }
        int[] areas = new int[heights.length];
        areas[0]=heights[0];
        int maxArea=0;
        for(int i=0; i<heights.length;i++){
            int width= 1;
            int j=i-1, k=i+1;
            while(j>=0 && heights[i]<=heights[j]){
                width++;
                j--;
            }
            while(k<heights.length && heights[i]<=heights[k]){
                width++;
                k++;
            }
          /*  if(heights[i]> heights[i+1] && heights[i]>heights[i-1]){
                maxArea= Math.max(heights[i], maxArea);
            }*/
            int area= heights[i]*width;
            areas[i]=area;
            maxArea= Math.max(area, maxArea);

        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] h= {2,1,5,6,2,3};
        

        System.out.println(largestRectangleArea(h));
    }
}
