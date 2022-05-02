package com.practice;

public class UniquePaths {


    /*
    https://leetcode.com/problems/unique-paths/
     */
    public static int uniquePathsSolution(int m, int n) {
       if(m==1 || n==1){
           return 1;
       }
       int answer=0;

       answer= findPath(0,0, answer, m, n );

       return answer;
    }

    public static int findPath(int currRow, int currCol, int ans, int m , int n ){
        if(currRow==m-1 && currCol==n-1){
            return ans+1;
        }

        if(currRow<m-1 ){
           ans= findPath(currRow+1,currCol,ans,m,n);
        }
        if( currCol<n-1){
           ans=    findPath(currRow,currCol+1,ans,m,n);
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(uniquePathsSolution(19,13));
    }
}
