package com.practice;

import java.util.ArrayList;
import java.util.List;

public class GroupAnagram {

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();


        for(int i =0; i<strs.length;i++){
            int flag=0;
            for(List l : list){
              if( checkAnagram( (String)l.get(0),strs[i])){
                  l.add(strs[i]);
                  list.remove(l);
                  list.add(l);
                  flag=1;
                  break;  }
              }
            if(flag==0){
            List<String>  str = new ArrayList<>();
            str.add(strs[i]);
            list.add(str); }
            }
    return list;
        }



    public static boolean checkAnagram(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        int[] count1= new int[256];
        int[] count2= new int[256];

        for(int i=0; i<s1.length();i++){
            count1[(int)(s1.charAt(i))]++;
            count2[(int)(s2.charAt(i))]++;

        }

        for(int i =96; i<123;i++){
            if(count1[i]!=count2[i]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] s= {"tea","tan","ate","nat","bat"};
        List<List<String>> l =new ArrayList<>();
        l=groupAnagrams(s);
        System.out.println(l);
    }
}
