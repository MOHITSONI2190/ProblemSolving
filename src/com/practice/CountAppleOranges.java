package com.practice;

import java.util.List;

public class CountAppleOranges {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
  int appleCount=0;

  int appleEnd= t-a;
  int orangeStart=s+b;
        for(int apple : apples){
          if( apple>=0 && apple<appleEnd){
             appleCount++;
          }
        }

    }
}
