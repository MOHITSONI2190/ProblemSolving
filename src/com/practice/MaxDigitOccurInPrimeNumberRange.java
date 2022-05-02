package com.practice;

public class MaxDigitOccurInPrimeNumberRange {
    /*
    https://practice.geeksforgeeks.org/problems/find-the-highest-occurring-digit-in-prime-numbers-in-a-range3634/1
     */
    public static int maxDigit(int L, int R)
    {
        // code here
        int maxCount=0;
        int digit=0;
        String primeString ="";

        for(int i=L; i<=R; i++){
          if(i==0 || i==1){
              continue;
          }
            int flag=0;
          for( int j=2; j<=i/2;++j){
              if(i%j==0){
                  flag=1;
                  break;
              }

          }
          if(flag==0) {
              primeString += String.valueOf(i);
          }

        }
        int maxAscii=256;
        int[] count= new int[maxAscii];
        int len = primeString.length();

        for(int i=0;i<len;i++){
            count[primeString.charAt(i)]++;
        }

        for(int j=0;j<len;j++ ){
            if(count[primeString.charAt(j)]>=maxCount){
                maxCount=count[primeString.charAt(j)];
                digit=Character.getNumericValue(primeString.charAt(j));
            }
        }

        return digit;
    }

    public static void main(String[] args) {
       System.out.println(MaxDigitOccurInPrimeNumberRange.maxDigit(2,10));
    }
}
