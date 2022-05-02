package com.practice;

public class LongestCommonSubsequence {

    /*

    https://leetcode.com/problems/longest-common-subsequence/
     */
    public int longestCommonSubseq(String text1, String text2) {
        int [][]dp = new int[text1.length()+1][text2.length()+1];

        for(int i=0;i<dp.length;i++){
            for(int j=0; j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
     return  recur(text1, text2, 0,0, dp);
    }

    public int recur(String text1, String text2, int i, int j, int [][]dp){

        if(i>=text1.length() || j>=text2.length()) return 0;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(text1.charAt(i)==text2.charAt(j)){
            dp[i][j]= 1+recur(text1,text2,i+1,j+1, dp);
            return dp[i][j];
        }else{
            dp[i][j]=   Math.max(
                 recur(text1,text2,i+1,j,dp),
                 recur(text1,text2,i,j+1,dp));
            return dp[i][j];
        }
     }
}
