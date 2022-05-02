package com.practice;

import java.util.Stack;

public class LongestValidParenthesis {

    public static int longestValidPar(String str){
        Stack<Character> stack = new Stack<>();
        int max=0, curr=0;

        for(int i =0;i < str.length();i++){
            char c = str.charAt(i);

            switch(c){
                case '(':
                    stack.push('(');
                    break;
                case ')':
                    if(!stack.isEmpty()){
                        stack.pop();
                        curr+=2;
                        max= Math.max(max,curr);
                    }else{
                        max= Math.max(max,curr);
                        curr=0;
                    }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(longestValidPar("(())((((())(()))"));
        //))(())(((())(()))
    }
}
