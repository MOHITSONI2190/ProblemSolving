package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findImbalance {

    public static long findTotalImbalance(List<Integer> rank) {
        // Write your code here
        long output=0L;
       // Integer[] arr = rank.toArray( new Integer[0]);

        for(int i=0; i<rank.size();i++){
            for( int l= 0;l+i< rank.size();l++){
                int [] a= new int[i+1];
                for(int j=0; j<i+1 && j<rank.size() ; j++){
                    a[j]=rank.get(j+l);
                }

                Arrays.sort(a);


                int left_pointer=a[0];
                int right_pointer=a[a.length-1];

                while(left_pointer<right_pointer && left_pointer<a.length-1 && right_pointer>0){
                    if(a[left_pointer+1]-a[left_pointer]>1){
                        output++;
                        left_pointer++;
                    }
                    if(a[right_pointer]-a[right_pointer-1]>1){
                        output++;
                        right_pointer--;
                    }
                }

            }
        }
        return output;




/*        for(int i=0; i<arr.length; i++){
            for(int j=i; i<arr.length; i++){
                for(int k=i; i<arr.length; i++){

            }
        }*/
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(3); list.add(2);

        System.out.println(findImbalance.findTotalImbalance(list));


    }
}
