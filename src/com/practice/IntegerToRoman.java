package com.practice;

public class IntegerToRoman {

    public static String intToRoman(int num) {

        int[] n={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] r={"I", "IV", "V", "IX", "X", "XL", "L","XC","C", "CD", "D", "CM", "M"};
        int index=n.length-1;
        String ans="";
         while(num>0){
             while(n[index]<=num){
                ans+=r[index];
                num-=n[index];
             }
             index--;
         }
  return ans;
    }


    public static void main(String[] args) {
        System.out.print(IntegerToRoman.intToRoman(3000));
    }
}
