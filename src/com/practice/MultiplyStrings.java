package com.practice;

public class MultiplyStrings {

    public String multiply(String num1, String num2) {
        String answer= "";
        int[] mults= new int[num2.length()];
      if("0".equals(num1) ||"0".equals(num2)){
          return "0";
      }

      //making sure num2 is always the smaller number
      if(num1.length()<num2.length()){
          String temp= num1;
          num1=num2;
          num2=temp;
      }


        int zero=0;
      for(int i=num2.length()-1; i>=0;i--){
             int a= num2.charAt(i)+0;
             int carry=0;
             String m="";

             for(int j=num1.length()-1; j>=0;j--){
                 int b= num1.charAt(j)+0;
                 int x= a*b;
                  x=(carry+x)%10;
                  m=String.valueOf(x)+m;
                 carry= x/10;
             }
             m=String.valueOf(carry)+m+zeroCount(zero);
             zero++;

      }
      return answer;
    }

    public  String zeroCount(int n){
        if (n == 0) {
            return "";
        }
        String zeroes="";
        for(int i =1;i<=n;i++){
            zeroes+="0";
        }

        return zeroes;
    }
}
