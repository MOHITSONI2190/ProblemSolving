package com.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class StringNthWordWithMtimeOccurence {

    public static String[] calc(String[] arr, int n , int m){
        String[] output= new String[arr.length];

        HashMap<String, Integer> freqMap = new HashMap<>();

        for (int i=0;i<arr.length;i++){      //O(n)
            if(freqMap.containsKey(arr[i])){
                freqMap.put(arr[i], freqMap.get(arr[i])+1);
            }
            else {
                freqMap.put(arr[i],1);
            }
        }

        //O(nlogn)
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(final String o1, final String o2) {
                return o1.length() > o2.length() ? -1 : 1;
            }
        });


         String [] x = new String[arr.length];
         x[0]=arr[0];
         int j=0;
         for(int i=1; i<arr.length;i++){
             if(arr[i].length()==arr[i-1].length()){
                 x[j]=x[j]+","+arr[i];
             }else{
                 j++;
                 x[j]=arr[i];
             }

         }

         String nthString = x[n-1];
         String[] allString= nthString.split(",");

          j=0;
         for(String i : allString){
             if(freqMap.get(i)>m){
               output[j]=i;
               j++;
             }
         }
        return output;

    }


    public static void main(String[] args) {
        String[] arr ={"I", "have", "a", "cat", "and", "have", "dog", "cat"};

        StringNthWordWithMtimeOccurence.calc(arr,1,1);
    }

}
