package com.practice;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>>  output = new ArrayList<>();
        int currInde=0;
        List<String> currList = new ArrayList<>();
 return null;
    }




    static boolean checkPalindrome(String s){
        int i=0, j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;  j--;
        }
        return true;
    }

    public static void main(String[] args) {
      System.out.println(  checkPalindrome("ab"));
    }
}
