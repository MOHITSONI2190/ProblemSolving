package com.practice;

public class StringPalindrome {

    public static boolean isPalindrome(String s, int start, int end){
        int len = s.length();
        if(len==0 || start==end){
            return true;
        }

        if(s.charAt(start)!= s.charAt(end)){
            return false;
        }
        if(start< end){
          return  isPalindrome(s, start+1, end-1);
        }
        return true;
    }

    public static void main(String[] args) {
        String s="aaa";
      System.out.println(
        StringPalindrome.isPalindrome(s,0, s.length()-1));

    }
}
