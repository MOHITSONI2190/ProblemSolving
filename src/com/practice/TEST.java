package com.practice;

import java.math.BigInteger;
import java.util.*;


public class TEST {



    public static void fizzBuzz(int n) {
        // Write your code here
    for(int i=1; i<=n;i++){
      if(i%3!=0 && i%5!=0){
          System.out.println(i);
      }else if(i%3==0 && i%5==0){
          System.out.println("FizzBuzz");
      }
      else if(i%3==0){
          System.out.println("Fizz");
      }
      else{
          System.out.println("Buzz");
      }
     }
    }
    public static final String list = "ABCD ";
    public static void main(String[] args) {
       // fizzBuzz(15);

       // System.out.print(Math.pow(2, -31));

String a= "ABCD";
       System.out.println(list.contains(a));
    }
}
