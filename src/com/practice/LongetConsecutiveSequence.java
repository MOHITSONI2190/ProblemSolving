package com.practice;

import javax.naming.PartialResultException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongetConsecutiveSequence {
    public int longestConsecutive(int[] nums) {

        int seq=0;
        Set<Integer> set= new HashSet<>();
        for(int i =0; i<nums.length; i++){
                set.add(nums[i]);
        }
   for(int i =0; i <nums.length;i++){

       if(!set.contains(nums[i]-1)){

           int j = nums[i];
           while(set.contains(j)){
               j++;
           }
           if(seq<j-nums[i]){
               seq=j-nums[i];
           }


       }
   }
return seq;
    }
}
