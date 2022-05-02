package com.practice;

import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

public class ParanthesisChecker {

    static boolean ispar(String x)
    {

        // add your code here
        Stack<Character> stack = new Stack<Character>();
        for(int i =0 ; i<x.length();i++){
            char a= x.charAt(i);
                switch (a){
                    case '}':
                        if(stack.isEmpty() || stack.pop()!='{'){
                            return false;
                        }
                        break;
                    case ']':
                        if(stack.isEmpty() || stack.pop()!='['){
                            return false;
                        }
                        break;
                    case '(':
                        stack.push('(');
                        break;

                    case '{':
                        stack.push('{');
                        break;
                    case '[':
                        stack.push('[');
                        break;

            }
        }
        if(stack.isEmpty()){
            return true;
        }
        else{


            return false;

        }
    }
}
