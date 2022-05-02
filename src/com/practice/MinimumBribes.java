package com.practice;

import java.util.ArrayList;
import java.util.List;

public class MinimumBribes {
    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        int bribeCount=0;
      for(int i=0; i<q.size();i++) {
          if (Math.abs(q.get(i) - (i + 1)) > 2) {
              System.out.println("Too chaotic");
              return;
          }
      }

      for(int j=0; j<q.size();j++) {
          for (int i = 0; i < q.size() - j; i++) {
             if (q.get(i) > i + 1) {
                  int a = q.get(i);
                  q.set(i, q.get(i + 1));
                  q.set(i + 1, a);
                  bribeCount++;

              }
          }
      }
      System.out.println(bribeCount);

    }

    public static void main(String[] args) {
        List<Integer> q= new ArrayList<>();
        q.add(2);
        q.add(1);
        q.add(5);
        q.add(3);
        q.add(4);

        minimumBribes(q);
    }
}
