package com.practice;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;

public class LongestStringChain {

    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a,b)-> a.length()-b.length());
        HashMap<String, Integer> memo= new HashMap<>();
int res=0;
        for(String word : words){
            memo.put(word,1);

            for(int i=0;i<word.length();i++){
                String next = word.substring(0,i)+word.substring(i+1);

                if(memo.containsKey(next)){
                    memo.put(word, Math.max(memo.get(word), memo.get(next)+1));
                }
            }
          res= Math.max(res, memo.get(word));
        }

        return res;
    }



}
