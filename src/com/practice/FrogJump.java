package com.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class FrogJump {

    public boolean canCross(int[] stones) {

        HashMap<Integer, HashSet<Integer>> dp= new HashMap<>();

        for(int stone : stones){
            dp.put(stone, new HashSet<>());
        }

        dp.get(stones[0]).add(1);

        for(int i=0;i<stones.length;i++){
            int currStone= stones[i];
            HashSet<Integer> jumps = dp.get(currStone);

            for(int jump :jumps){
                    int nextStone =currStone+jump;
                    if(nextStone==stones[stones.length-1]){
                        return true;
                    }
                if(dp.containsKey(nextStone)){
                    if(jump>1) {
                        dp.get(nextStone).add(jump - 1);
                    }
                    dp.get(nextStone).add(jump);
                    dp.get(nextStone).add(jump+1);
                }
            }
        }

        return false;

    }
}
