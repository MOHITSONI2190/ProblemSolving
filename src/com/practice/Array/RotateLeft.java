package com.practice.Array;

import java.util.ArrayList;
import java.util.List;

public class RotateLeft {

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here
        List rotatedList = new ArrayList<Integer>();
        int len = a.size();
        int rotCount= d%len;

        if(rotCount==0 ||rotCount==len){
            return a;
        }
        else{
            int index=0;
            for(int i =rotCount; i<len;i++){
                rotatedList.add(index, a.get(i));
                index++;
            }
            for(int i =0; i<rotCount;i++){
                rotatedList.add(index, a.get(i));
                index++;
            }

        }
        return  rotatedList;
    }

    public static void main(String[] args) {
        List x= new ArrayList<Integer>();
        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);
        x.add(5);


        List<Integer> a =   rotLeft(x, 2);

        for (Integer num : a){
            System.out.println(num);
        }

    }
}
