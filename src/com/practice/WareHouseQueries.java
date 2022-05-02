package com.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WareHouseQueries {

    public static List<List<String>> performWarehouseQueries(List<List<String>> query) {
        // Write your code here
        List<List<String>> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        for(List l : query){
            if(l.get(0).equals("INSERT")){
                queue.add((String)l.get(1));
            }else if(l.get(1).equals("SHIP")){
                int count=0;
                List<String> list = new ArrayList<>();
                if(queue.size()>=3){

                    while(count<3 && !queue.isEmpty()){
                        list.add(queue.poll());
                    }

                }
                list.add("N/A");
                result.add(list);
            }
        }


        return result;
    }


    public static void main(String[] args) {
        List<List<String>> list= new ArrayList<>();
      List<String> l1 =new ArrayList<>();
      l1.add("INSERT");
      l1.add("GT23513413");

        List<String> l2 =new ArrayList<>();
        l2.add("INSERT");
        l2.add("TQC2451340");


        List<String> l3 =new ArrayList<>();
        l3.add("SHIP");
        l3.add("-");


        List<String> l4 =new ArrayList<>();
        l4.add("INSERT");
        l4.add("VYP8561991");


        List<String> l5 =new ArrayList<>();
        l5.add("SHIP");
        l5.add("-");

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);list.add(l5);



    }

}
