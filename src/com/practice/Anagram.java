package com.practice;

public class Anagram {

    public void mohit( String s){
        System.out.print("inside String");
    }

    public void mohit( Object s){
        System.out.print("inside Object");
    }

    public static void main(String[] args) {
        Anagram a= new Anagram();
        a.mohit(null);
    }
}
