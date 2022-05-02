package com.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class CarPooling {

    public static boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });

        PriorityQueue<int []> minHeap = new PriorityQueue<>((a,b) ->a[2]-b[2]);

        for(int i=0; i<trips.length;i++){
            minHeap.add(trips[i]);
        }

        int currentPassenger=0;
        for(int i =0;i<trips.length;i++){
           int numPassenger=  trips[i][0];
           int start =  trips[i][1];
           int end =  trips[i][2];
         int []minEle =  minHeap.peek();
         currentPassenger+=numPassenger;
         while(minEle[2]<=start){
             currentPassenger-=minEle[2];
             minHeap.poll();
             minEle= minHeap.peek();
         }
         if(currentPassenger>capacity){
             return false;
         }

        }

        return true;
    }


    public static void main(String[] args) {
        int[][] trips ={{10,5,7},{10,3,4},{7,1,8},{6,3,4}};

        System.out.println(carPooling(trips,24));
    }
}
