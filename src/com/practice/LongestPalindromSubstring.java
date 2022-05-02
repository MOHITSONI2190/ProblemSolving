package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestPalindromSubstring {

    public static String longestPalindrome(String s) {
        String resultPal="";
        int resultLen=0;
        int r=0,l=0;

        for(int i =0;i<s.length();i++){
            r=i; l=i;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                if(r-l+1 > resultLen)
                {
                    resultLen=r-l+1;
                    resultPal=s.substring(l,r+1);
                }
                l--; r++;
            }

            l=i; r=i+1;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                if(r-l+1 > resultLen)
                {
                    resultLen=r-l+1;
                    resultPal=s.substring(l,r+1);
                }
            l--; r++;
            }
        }


        return resultPal;
    }

    public static void main(String[] args) {
        System.out.print(LongestPalindromSubstring.longestPalindrome("aaaa"));



    }
}
