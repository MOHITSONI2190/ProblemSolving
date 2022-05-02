package com.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GrayCode {

    public static List<Integer> grayCode(int n) {
    List<Integer> outputList = new ArrayList<>();

    Set<Integer> set = new HashSet<>();
    int codeLen = (int) Math.pow(2,n);
    for(int i=0; i<codeLen;i++){
        set.add(i);
    }


        outputList.add(0);
    int i=1;
    while(outputList.size()<codeLen){
         int prevNum =outputList.get(i);
         for(int nextNum : set){
             checkCompatibility(prevNum, nextNum);
         }


    }


    return outputList;
    }

    public static boolean checkCompatibility(int prev, int curr){
        String prevBinary= calcBinary(prev);
        String currBinary =calcBinary(curr);


        return false;
    }

    public static String calcBinary(int n){
        StringBuilder binary= new StringBuilder();
        while(n>0){
            binary.append(  String.valueOf(n%2));
            n=n/2;

        }
        return binary.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(calcBinary(8));
    }
}
