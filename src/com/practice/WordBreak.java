package com.practice;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {
    /**
     * https://leetcode.com/problems/word-break/
     */

    //slow method
    public static boolean wordBreak(String s, List<String> wordDict) {
        if(s.length()==0){
            return true;
        }
        for(int i =0;i<wordDict.size();i++){
            if(s.startsWith(wordDict.get(i)) && wordBreak(s.substring(wordDict.get(i).length()), wordDict)){
                return  true;
            }
        }

        return false;
    }


    public static boolean wordBreakDp(String s, List<String> wordDict) {

        boolean[] dp= new boolean[s.length()+1];
        dp[s.length()]=true;

        for(int i =s.length()-1;i>=0;i--){
            for(String word : wordDict){

                if(word.length()<=s.substring(i).length() && s.substring(i, i+word.length()).equals(word)){
                    dp[i]=dp[i+word.length()];

                }
                if(dp[i]){
                    break;
                }
            }
        }
        return dp[0];
    }



    public static void main(String[] args) {
     /*   System.out.println("happy".contains("ap"));
        System.out.println("happy".indexOf("ap"));
        int startIndex = "happy".indexOf("py");
        System.out.println("happy".substring(0,startIndex).concat("happy".substring(startIndex+"py".length())));
*/
        List<String> wordDict = new ArrayList<>();
        wordDict.add("a");
        wordDict.add("abc");
        wordDict.add("b");
        wordDict.add("cd");



        System.out.println(wordBreakDp("abcd", wordDict));
    }
}
