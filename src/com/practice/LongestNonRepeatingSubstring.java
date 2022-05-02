package com.practice;

public class LongestNonRepeatingSubstring {

    public static int longestSubstringLength(String str){
        char[] chars = str.toCharArray();
        String temp="";
        int maxLen=0;

        if(str.isEmpty()){ return 0;}
        if(str.length()==1){ return 1;}

        for(int i=0; i<chars.length; i++){
             if(temp.contains(String.valueOf(chars[i]))){
              temp=temp.substring(temp.indexOf(chars[i])+1);
             }
            temp=temp+String.valueOf(chars[i]);
    maxLen=Math.max(temp.length(),maxLen);
        }


        return maxLen;

    }

    public static void main(String[] args) {
        System.out.println(longestSubstringLength("abcdabc"));
    }
}
