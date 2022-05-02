package com.practice;

public class JumpGameII {

    public static int jump(int[] nums) {
       int n =  nums.length;

       int [] jump= new int[n];
       jump[n-1]=0;

         for(int i=n-2; i>=0; i--){
                      int x =nums[i]+i;
             if(x>= n-1){
                 jump[i]=1;
                 continue;
             }
             int min=Integer.MAX_VALUE;
             for(int j=i+1; j<=Math.min(n-1, x);j++ ){
                if(jump[j]!=0)
                 min = Math.min(min,jump[j]);
         }
             if(min!=Integer.MAX_VALUE)
             jump[i]=min+1;

     }

         return jump[0];
    }

    public static void main(String[] args) {
        int [] nums = {2,3,1,1,4};

       System.out.print( jump(nums));
    }
}
