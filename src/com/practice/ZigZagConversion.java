package com.practice;

public class ZigZagConversion {
    /*
    https://leetcode.com/problems/zigzag-conversion/

    PAYPALISHIRING
     */

    public static String convert(String s, int numRows) {
       String zigZag="";
       String[] arr = new String[numRows];

       if(numRows==1){
           return s;
       }
       for(int i =0;i<numRows;i++){
           arr[i]="";
       }
       boolean downFlag=false;

       int row=0;

       for(int i =0;i<s.length();i++){
           arr[row]+=s.charAt(i);
           if(row==0){
               downFlag=true;
           }
           if(row==numRows-1){
               downFlag=false;
           }
           if(downFlag){
               row++;
           }
           else{
               row--;
           }
       }

       for(int i =0;i<arr.length;i++){
           zigZag+=arr[i];
       }
       return zigZag;
}

    public static void main(String[] args) {
   System.out.print(ZigZagConversion.convert("PAYPALISHIRING",4));

    }
}