package com.practice;

import java.util.ArrayList;
import java.util.List;

public class generateParanthesis {

    public static void ParanthesisGen(ArrayList<String> list, String s, int open, int close, int n){

        if(open==n && open==close){
            list.add(s);
            return;
        }
        if(open<n){
            ParanthesisGen(list, s+"(", open+1, close,n);
        }
        if(close<open){
            ParanthesisGen(list, s+")", open, close+1,n);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        generateParanthesis.ParanthesisGen(list,"",0,0,2);
        System.out.print(list);

    }
}
