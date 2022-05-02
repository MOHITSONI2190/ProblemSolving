package com.practice;

public class SpecialString {

   public static long substrCount(int n, String s) {
int count=s.length();
   for(int i=2; i<=s.length(); i++){
       for(int j=0; j<s.length()-i+1; j++){
           String subStr =(s.substring(j,j+i));

           if(subStr.length()%2!=0){
               char s1= subStr.charAt(0);

               int equal=1;
               for(int k=0;k<(subStr.length()/2)-1;k++){
                   char s2= subStr.charAt(k);
                   if(s1!=s2){ equal=0;  break;}
               }
               if(!subStr.substring(0,subStr.length()/2).equals(subStr.substring((subStr.length()/2)+1))){
                   equal=0;
               }

               if (equal==1){
                   count++;
               }

           }
            else if(subStr.length()>0){
               char  s1= subStr.charAt(0);
               int equal=1;
               for(int k=0; k<subStr.length();k++){
                        char s2= subStr.charAt(k);
                        if(s1!=s2){ equal=0;}
               }
               if (equal==1){
                   count++;
               }

           }

       }
   }
   return count;
    }


    public static long substrCount1(int n, String str) {


       for (int i=0;i<str.length();i++){
           char iChar = str.charAt(i);
           int middleCharIndex=-1;

           for(int j =i+1; j< str.length(); j++){
               char jChar = str.charAt(j);
               if(iChar== jChar){
                if(middleCharIndex==-1 || (j-middleCharIndex)==(middleCharIndex-i)){
                    n++;
                }
               }
               else if(middleCharIndex==-1){
                   middleCharIndex=j;
               }
               else{
                   break;
               }
           }
       }
       return n;
    }



    public static void main(String[] args) {
       //System.out.println("aaaa".substring(1,1));

    System.out.println(substrCount1(5, "aadaa"));
    }


}
