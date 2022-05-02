package com.practice;

import sun.print.SunMinMaxPage;

public class AddiingTwoVeryLargeNumbers {

    public static String sum(String str1, String str2) {

        String sumString = "";
        if (str1.length() > str2.length()) {
            String t = str1;
            str1 = str2;
            str2 = t;
        }
        String s1 = new String(new StringBuilder(str1).reverse());
        String s2 = new String(new StringBuilder(str2).reverse());

        int carry = 0;
        for (int i = 0; i < s1.length(); i++) {

            int s = Character.getNumericValue(s1.charAt(i)) + Character.getNumericValue(s2.charAt(i)) + carry;

            sumString = sumString + String.valueOf(s % 10);
            carry = s / 10;
        }

        for (int i = s1.length(); i < s2.length(); i++) {

            int s = Character.getNumericValue(s2.charAt(i)) + carry;

            sumString = sumString + String.valueOf(s % 10);
            carry = s / 10;
        }
        if (carry > 0){
            sumString = sumString + String.valueOf(carry);
         }
    return sumString;
    }

    public static void main(String[] args) {
        System.out.println(AddiingTwoVeryLargeNumbers.sum("342","465"));
    }
}
