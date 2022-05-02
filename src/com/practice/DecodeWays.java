package com.practice;

public class DecodeWays {
    public static int numDecodings(String s) {

        int []dp = new int[s.length()+1];
        dp[0]=1;
        if(s.length()>=1){
            dp[1]= s.charAt(0)=='0'? 0:1;
        }

        for(int i =2; i<=s.length();i++){
            if(Integer.valueOf(s.substring(i-1,i))>0){
               dp[i]+=dp[i-1];
            }
            if(Integer.valueOf(s.substring(i-2,i))>=10 && Integer.valueOf(s.substring(i-2,i))<=26){
                dp[i]+=dp[i-2];
            }
        }
  return dp[s.length()];
    }

    public static void main(String[] args) {
   System.out.println(numDecodings("06"));
    }
}
