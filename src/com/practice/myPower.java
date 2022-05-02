package com.practice;

import java.text.DecimalFormat;

public class myPower {
    public static double myPow(double x, int n) {

      double answer=x;
         if(n==0) return 1.0;


        int p=Math.abs(n);
        if(p%2==0) {
            answer=1;

            for (int i = 2; i <=p ; ) {
                answer = answer * x * x;
                i = i + 2;
            }
        }
        else{
            for (int i = 2; i <p ; ) {
                answer = answer * x * x;
                i = i + 2;
            }

           // answer=answer*x;
        }

        if(n>0){
          return   answer;
         }
         else{
        return 1/answer;
         }
    }

    public static void main(String[] args) {
        System.out.println(myPower.myPow(2.00000,
                4));
    }
}
