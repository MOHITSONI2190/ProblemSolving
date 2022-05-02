package com.practice;

public class SolvingQuestionsWithBrainPower {

    public static long mostPoints(int[][] questions) {
        if(questions.length==0){
            return 0;
        }
        if(questions.length==1){
            return questions[0][0];
        }
        long dp[]= new long[questions.length];
        for(int i= questions.length-1; i>=0;i--){
            int powerI= questions[i][0];
            int brainI= questions[i][1];
                if(i==questions.length-1){
                    dp[i]=questions[i][0];
                }else if(i+brainI+1>= questions.length){
                    dp[i]= Math.max(dp[i+1], powerI);
                }else{
                    dp[i]=Math.max(dp[i+1],powerI+dp[i+brainI+1]);
                }
        }
        return dp[0];
    }

    public static void main(String[] args) {
        int[][] questions= {{21,5},
                            {92,3},
                            {74,2},
                            {39,4},
                            {58,2},
                            {5,5},
                            {49,4},
                            {65,3}};
        System.out.println(mostPoints(questions));
    }
}

