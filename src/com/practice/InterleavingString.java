package com.practice;

import java.util.HashMap;
import java.util.Map;

public class InterleavingString {

    public static boolean isInterleave(String s1, String s2, String s3) {
        int s1Len= s1.length();
        int s2Len= s2.length();
        int s3Len= s3.length();
        int s1Index=0;
        int s2Index=0;
       if(s1Len+s2Len!=s3Len){
           return false;
       }
       if(s1Len==0){
           if(s2.equalsIgnoreCase(s3)){
               return true;
           }
           return false;
       }
       if(s2Len==0){
           if(s1.equalsIgnoreCase(s3)){
               return true;
           }
           return false;
       }

    return checkInterleave(s1,s2,s3,0,0,0);
    }

    public static boolean checkInterleave(String s1, String s2, String s3, int s1Index, int s2Index, int s3Index){

        if(s3Index==s3.length()){
            if(s1Index==s1.length() && s2Index==s2.length()){
                return true;
            }
            return false;
        }
        if(s1Index<s1.length() && s3.charAt(s3Index)==s1.charAt(s1Index)
            && s2Index<s2.length() && s3.charAt(s3Index)==s2.charAt(s2Index)){
        return(    checkInterleave(s1,s2,s3,s1Index+1,s2Index,s3Index+1)||
            checkInterleave(s1,s2,s3,s1Index,s2Index+1,s3Index+1));
        }else if(s1Index<s1.length() && s3.charAt(s3Index)==s1.charAt(s1Index)){
            return   checkInterleave(s1,s2,s3,s1Index+1,s2Index,s3Index+1);
        }else if( s2Index<s2.length() && s3.charAt(s3Index)==s2.charAt(s2Index)){
            return    checkInterleave(s1,s2,s3,s1Index,s2Index+1,s3Index+1);
        }else return false;
    }

    public static boolean isInterleavV2(String s1, String s2, String s3) {
        int s1Len= s1.length();
        int s2Len= s2.length();
        int s3Len= s3.length();
        int s1Index=0;
        int s2Index=0;
        if(s1Len+s2Len!=s3Len){
            return false;
        }

        Boolean [][] dp = new Boolean[s1Len+1][s2Len+1];

        dp[s1Len][s2Len]=true;

        for(int i=s1Len-1;i>=0;i--){
            for(int j=s2Len-1; j>=0;j--){
             if(s1.charAt(i)==s3.charAt(i+j) && dp[i+1][j]){
                 dp[i][j]=true;
             }
             if(s2.charAt(j)==s3.charAt(i+j) && dp[i][j+1]){
                 dp[i][j]=true;
             }
            }
        }

        return dp[0][0];

    }

    public static void main(String[] args) {
        System.out.println(isInterleave("aabcc","dbbca","aadbbbaccc"));

    }
}
