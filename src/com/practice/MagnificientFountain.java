package com.practice;

public class MagnificientFountain {

    public static int findLcm(int arr[]){

        int lcm = arr[0];
        int gcd= arr[0];

        for(int i =1;i<arr.length;i++){
            gcd= findGcd(arr[i], lcm);
            lcm=(lcm*arr[i])/gcd;
        }

        return lcm;
    }


    public static int findGcd(int a, int b){
        if(b==0){
            return a;
        }

        return findGcd(b, a%b);
    }

    public static void main(String[] args) {
        int [] arr= {2,4,6,8};
        System.out.print(MagnificientFountain.findLcm(arr));
    }
}
