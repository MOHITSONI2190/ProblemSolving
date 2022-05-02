package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class postFixEvaluation {
    public static int evaluatePostFix(String s)
    {
        // Your code here
        int val=0;
        Stack<Integer> stk= new Stack<Integer>();
        char[] operator= {'*', '/', '+', '-'};
        List opList=Arrays.asList(operator);
        for(int i =0; i<s.length();i++){
         char c= s.charAt(i);
         int v= Character.getNumericValue(c);
          if(v>=0 &&v<=9){
          stk.push(v);
          } else {
             if(stk.isEmpty()){
                 return 0;
             }
             int val1= stk.pop();
             int val2= stk.pop();
            switch(c) {
                case '+':
                     val=val1+val2;
                    stk.push(val);
                    break;
                case '-':
                     val=val2-val1;
                    stk.push(val);
                    break;
                case '/':
                     val=val2/val1;
                    stk.push(val);
                    break;
                case '*':
                     val=val1*val2;
                    stk.push(val);
                    break;
            }

         }

        }
        return val;
    }

    public static void main(String[] args) {
        System.out.println(postFixEvaluation.evaluatePostFix("49*7+"));
    }
}
