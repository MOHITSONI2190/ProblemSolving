package com.practice;

import java.util.ArrayList;
import java.util.List;

public class WordSearch {

    /*
    https://leetcode.com/problems/word-search/

    76/83 passed
     */

    public static boolean exist(char[][] board, String word) {
       char [] wordArr = word.toCharArray();
       int boardRows = board.length;
       int boardColumns= board[0].length;
      // Coordinates[] visited = new Coordinates[boardRows* boardColumns];

        List<Coordinates>startInd = new ArrayList<>();
       if(wordArr.length > (boardRows* boardColumns)){
           return false;
       }
       int k=0;
       for(int i=0;i<boardRows; i++){
           for(int j=0;j<boardColumns;j++){
               if(wordArr[0]==board[i][j]){
                startInd.add( new Coordinates(i,j));
                k++;
               }
           }
       }
       if(startInd.size()==0) { return false;}
        int i=0;
      // System.out.println("startInd.length :"+startInd.size());
       for(;i<startInd.size();i++) {
           List<Coordinates> visited = new ArrayList<>();
        //   visited.add(startInd[i]);
          if( dfs(wordArr, board, 0, visited, startInd.get(i))){
              return true;
          }
       }
      if(i-1 ==startInd.size()){
          return false;
      }
      return false;
    }

    public static boolean isVisited(int x, int y , List<Coordinates> visiteds){
   for(Coordinates visited : visiteds) {
       if (visited.x == x && visited.y == y) {
           return true;
       }
   }

   return false;
    }

    public static boolean dfs(char[] word, char[][] board, int wordIndex, List<Coordinates> visited, Coordinates currCord){
         if(wordIndex==word.length){
        return true;
         }
        if(currCord.x>=0 && currCord.x<board.length && currCord.y>=0 && currCord.y<board[0].length){
            if(board[currCord.x][currCord.y]==word[wordIndex] && !isVisited(currCord.x,currCord.y,visited)){
              //  System.out.print(board[currCord.x][currCord.y]);
                visited.add(new Coordinates(currCord.x,currCord.y));
            boolean a=  dfs(word,board,wordIndex+1,visited, new Coordinates(currCord.x+1,currCord.y));
            boolean b=    dfs(word,board,wordIndex+1,visited, new Coordinates(currCord.x-1,currCord.y));
            boolean c=      dfs(word,board,wordIndex+1,visited, new Coordinates(currCord.x,currCord.y+1));
            boolean d=      dfs(word,board,wordIndex+1,visited, new Coordinates(currCord.x,currCord.y-1));
            return (a||b||c||d);
            }
        }else{
            return false;
        }
        return false;
    }

    static class Coordinates{
     public   int x;
     public int y;

     public Coordinates(int x, int y){
         this.x=x;
         this.y=y;
     }

    }

    public static void main(String[] args) {
        char [][] board ={{'A','B','C','E'},
                          {'S','F','E','S'},
                          {'A','D','E','E'}};



        String word ="ABCESEEEFS";
        exist(board,word);
        System.out.println(board[0].length *board.length  +" : "+ exist(board,word));


    }
}
