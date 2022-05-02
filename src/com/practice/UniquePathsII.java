package com.practice;

import com.sun.org.apache.xpath.internal.objects.XObject;

public class UniquePathsII {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows=obstacleGrid.length;
        int col =obstacleGrid[0].length;
         int [][] dp = new int[rows][col];

          if(obstacleGrid[0][0]==1 || obstacleGrid[rows-1][col-1]==1){
              return 0;
          }
          dp[0][0]=1;
         for(int i =1; i<rows;i++ ){
             if(obstacleGrid[i][0]==1){
                dp[i][0]=0;
             }else {
                 dp[i][0] = dp[i - 1][0];
             }
         }
        for(int i =1; i<col;i++ ){
            if(obstacleGrid[0][i]==1){
                dp[0][i]=0;
            }else {
                dp[0][i] = dp[0][i - 1];
            }
        }

        for(int i =1;i< rows;i++){
            for(int j =1; j<col;j++){
                if(obstacleGrid[i][j]==1){
                    dp[i][j]=0;
                }else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }


        return dp[rows-1][col-1];

    }

  /*  public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m =obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if(m==1 || n==1){
            return 1;
        }
        int answer=0;

        answer= findPath(0,0, answer, m, n, obstacleGrid );

        return answer;
    }

    public static int findPath(int currRow, int currCol, int ans, int m , int n, int[][] obstacleGrid ){
        if(currRow==m-1 && currCol==n-1){
            return ans+1;
        }
        if(obstacleGrid[currRow][currCol]==1){
            return ans;
        }

        if(currRow<m-1 ){
            ans= findPath(currRow+1,currCol,ans,m,n,obstacleGrid);
        }
        if( currCol<n-1){
            ans=    findPath(currRow,currCol+1,ans,m,n,obstacleGrid);
        }

        return ans;
    }
*/
    public static void main(String[] args) {
        int [][]obstacleGrid= {{0,1},{0,0}};

        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }
}
