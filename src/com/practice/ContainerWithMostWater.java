package com.practice;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int xAxis= height.length-1;
        int start=0;
        int end=xAxis;
        int maxArea=0;
        int flag=0;

        while(start<=end){
            int h=height[start]>height[end]?height[end]: height[start];
            int area=h*(end-start);
            if(area>maxArea){
                maxArea=area;
            }
            if(height[start]>height[end]){
                end--;
            }else{
                start++;

            }

        }
        return maxArea;

    }

    public static void main(String[] args) {
        int[] height ={2,3,10,5,7,8,9};

        System.out.println(maxArea(height));
    }
}
