package com.practice;

import java.nio.charset.StandardCharsets;

public class ReverseString {

    public static String reversStr(String str){
    char[] charArray=  str.toCharArray();
    char[] reverseStr = new char[charArray.length];

    for(int i=0; i<charArray.length;i++){
        reverseStr[i]= charArray[str.length()-i-1];
    }
        return new String(reverseStr    );
    }

    public static void main(String[] args) {
        System.out.print(reversStr("mohit"));
    }
}
