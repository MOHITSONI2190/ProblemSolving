package com.practice;

import java.util.ArrayList;
import java.util.List;

public class QueenAttack {

    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {

        int u= n- r_q;
        int d = r_q-1;
        int l= c_q-1;
        int r = n-c_q;
        int ru= Math.min(u, r);
        int rd= Math.min(d,r);
        int lu=Math.min(u, l);
        int ld=Math.min(d,l);

        for(List<Integer> ob : obstacles){
            int rObstacle = ob.get(0);
            int cObstacle = ob.get(1);

            if(rObstacle == r_q){
                if(cObstacle<c_q){
                    l=Math.min(l,c_q-cObstacle-1);
                }
                else{
                    r=Math.min(r, cObstacle-c_q-1);
                }
            }
            if(cObstacle== c_q){
                if(rObstacle>r_q){
                    u=Math.min(u, rObstacle-r_q-1);
                }
                else{
                   d=Math.min(d,r_q-rObstacle-1);
                }
            }

            if(Math.abs(rObstacle-r_q)== Math.abs(cObstacle-c_q)){
                if(cObstacle>c_q){
                    if(rObstacle>r_q){
                        ru=Math.min(ru, cObstacle-c_q-1);
                    }else{
                        rd=Math.min(rd, c_q-cObstacle-1);
                    }
                }
                else{
                    if(rObstacle>r_q){
                        lu=Math.min(lu, cObstacle-c_q-1);
                    }
                    else{
                        ld=Math.min(ld, c_q-cObstacle-1);
                    }
                }
            }

        }

       return u+d+l+r+ru+rd+lu+ld;

    }


    public static void main(String[] args) {


        List<Integer> list1= new ArrayList<>();
        list1.add(5);
        list1.add(5);
        List<Integer> list2= new ArrayList<>();
        list2.add(4);
        list2.add(2);
        List<Integer> list3= new ArrayList<>();
        list3.add(2);
        list3.add(3);

            List<List<Integer>> list = new ArrayList<>();
                list.add(list1);
                list.add(list2);
                list.add(list3);
        QueenAttack.queensAttack(5,3,4,3, list);
    }
}
