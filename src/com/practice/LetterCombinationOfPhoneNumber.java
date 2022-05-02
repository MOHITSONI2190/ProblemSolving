package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfPhoneNumber {
    public static List<String> letterCombinations(String digits) {
        List<String> output= new ArrayList<>();

        HashMap <Integer,String> map= new HashMap<>();
        map.put(0,"");
        map.put(1,"");
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");

        if(digits.length()==0){ return  output; }


        method(digits, "", output, 0, map);
      return output;
    }

    public static void method(String digits, String ans, List<String> output,int index, HashMap<Integer, String> map){
       if(ans.length()==digits.length()){
           output.add(ans);
           return;
       }
       String currString= map.get(Character.getNumericValue(digits.charAt(index)));
       for(int i =0; i<currString.length();i++){
           method(digits,ans+currString.charAt(i), output ,index+1, map);
       }
    }

    public static void main(String[] args) {
System.out.print(LetterCombinationOfPhoneNumber.letterCombinations("23"));
    }
}
