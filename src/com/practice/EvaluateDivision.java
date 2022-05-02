package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvaluateDivision {

    /**
     *
     https://leetcode.com/problems/evaluate-division/

     */

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        double[] outputArr = new double[equations.size()];
        HashMap<String, HashMap<String, Double>> graph = new HashMap<>();
        for(int i=0;i<equations.size();i++){
            String from = equations.get(i).get(0);
            String to = equations.get(i).get(1);

            if(graph.containsKey(from)){
                graph.get(from).put(to,values[i]);
            }else{
                HashMap<String, Double> map = new HashMap<>();
                map.put(to,values[i]);
                graph.put(from, map);

            }

            if(graph.containsKey(to)){
                graph.get(to).put(from,1/values[i]);
            }else{
                HashMap<String, Double> map = new HashMap<>();
                map.put(from,1/values[i]);
                graph.put(to, map);

            }

        }
       for(int i =0 ; i<queries.size(); i++){
           List<String> visited  = new ArrayList<>();
           outputArr[i]= dfs(queries.get(i).get(0), queries.get(i).get(1), graph, visited );
       }
        return outputArr;
    }

    public double dfs(String from ,String to, HashMap<String, HashMap<String, Double>> graph, List<String> visited ){

        if(!graph.containsKey(from)){
            return -1;
        }
        if(graph.get(from).containsKey(to)){
            return graph.get(from).get(to);
        }

        visited.add(from);

        for(Map.Entry<String, Double> entry :  graph.get(from).entrySet()){
            if(!visited.contains(entry.getKey())){

            Double ans = dfs(entry.getKey(), to, graph, visited);
            if(ans!=-1.0) {
                return ans * entry.getValue();
            }

            }
        }

        return -1.0;

    }
}
