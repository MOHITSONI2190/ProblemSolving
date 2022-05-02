package com.practice;

import java.util.ArrayList;
import java.util.List;

public class NearlySimilarTriangle {

    public static long nearlySimilarRectangles(List<List<Long>> sides) {
        // Write your code here

        // Write your code here
        long count=0L;
        int size = sides.size();
        for(int i=0; i<size;i++){
            for(int j=i+1; j<size;j++){
                Double l1=new Double(sides.get(i).get(0))/ new Double(sides.get(j).get(0));
                Double l2=new Double(sides.get(i).get(1))/new Double(sides.get(j).get(1));
                   if(l1.equals(l2)){
                        count++;

                }
            }

        }
        count= (count-size)/2;
        return count;

    }

    public static void main(String[] args) {
        List<List<Long>> sides= new ArrayList<>();
        List<Long> side1 = new ArrayList<>();
        List<Long> side2 = new ArrayList<>();
        List<Long> side3 = new ArrayList<>();
        List<Long> side4 = new ArrayList<>();
        List<Long> side5 = new ArrayList<>();

        side1.add(2L); side1.add(1L);
        side2.add(10L); side2.add(7L);
        side3.add(9L); side3.add(5L);
        side4.add(6L); side4.add(9L);
        side5.add(7L); side5.add(3L);


        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
        sides.add(side4);
        sides.add(side5);

        System.out.println(NearlySimilarTriangle.nearlySimilarRectangles(sides));


    }
}
