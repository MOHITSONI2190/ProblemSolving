package com.practice;

public class JumpGameVII {

    /*
    https://leetcode.com/problems/jump-game-vii/
     */

    public static boolean canReach(String s, int minJump, int maxJump) {
         int n = s.length();
         if(s.charAt(n-1)=='1'){
             return false;
         }

         boolean[] jump = new boolean[n];
         jump[n-1]=true;

         for(int i=n-2; i>=0;i--){
             if(s.charAt(i)=='1'){
                 jump[i]=false;
                 continue;
             }
             if(i+minJump<=n-1){
                 for(int j=i+minJump; j<=Math.min(n-1,i+maxJump);j++){
                     if(s.charAt(j)=='0' && jump[j]==true){
                         jump[i]=true;
                         continue;
                     }
                 }
             }else {
                 jump[i]=false;
             }

         }
         return jump[0];
    }

    public static void main(String[] args) {
        System.out.println(canReach("011010",2,3));
    }
}
