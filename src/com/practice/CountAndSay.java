package com.practice;

public class CountAndSay {

    public static String countnSay(int n){
        String s="1";
if(n>=2){
    s="11";
}
        for(int i =2; i<n;i++){
            int count=1;
            String x="";
            for(int j =1; j<s.length();j++){

                if(s.charAt(j-1)==s.charAt(j)){
                    count++;
                }
                else{   x= x+String.valueOf(count)+s.charAt(j-1);  count=1;}

           }
           s=x+String.valueOf(count)+s.charAt(s.length()-1);;
        }

        return s;
    }

    public static void main(String[] args) {
      System.out.print( CountAndSay.countnSay(6));
    }
}
