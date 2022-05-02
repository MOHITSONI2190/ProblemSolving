package com.practice;

public class ReverseWordsInString {

    public static String reverseWords(String s) {

       String[] strs= s.split(" ");

       if(strs.length<=1){
           return s;
       }
        int i=0, j=strs.length-1;

       while(i<j){
           if(strs[i].equals("")) {
               i++;
               continue;
           }
           if(strs[j].equals("")) {
               j--;
               continue;
           }
           String temp= strs[i];
           strs[i]=strs[j];
           strs[j]=temp;
           i++;
           j--;
       }

       String output="";
       for(String k:strs){
           if(!k.equals("")){
               output+=k+" ";  }
       }

 return output.trim();
    }


    public static void main(String[] args) {
        System.out.print(ReverseWordsInString.reverseWords(" hello world "));
    }
}
