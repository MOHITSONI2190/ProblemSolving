package com.practice;

import java.util.*;

public class RomanToInteger {
    public static int romanToInt(String s) {

        Map<String, Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("IV",4);
        map.put("V",5);
        map.put("IX",9);
        map.put("X",10);
        map.put("XL",40);
        map.put("L",50);
        map.put("XC",90);
        map.put("C", 100);
        map.put("CD",400);
        map.put("D",500);
        map.put("CM",900);
        map.put("M",1000);

        if(s.length()==1){
            return map.get(s);
        }
        int index=0;
        int output=0;
        int len =s.length();
        while(index<s.length()){
           String a = Character.toString(s.charAt(index));
           String b= Character.toString(s.charAt(index+1));
        if(index<len-1 && map.containsKey(a+b)){
            output+=map.get(a+b);
            index++;
        }else{
            output+=map.get(a);
        }
        index++;
        }
return output;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));

        TreeMap<String, TreeMap<Integer,String>> map  = new TreeMap<>();

    }
}
