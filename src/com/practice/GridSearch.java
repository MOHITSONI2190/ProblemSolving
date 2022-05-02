package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class GridSearch {

    public static String gridSearch(List<String> G, List<String> P) {

        String firstPattern = P.get(0);
        int firstMatch = 0;
        int len = firstPattern.length();
        int i = 0, j = 0;
        for (String grid : G) {

            for (i = 0; i + len <= grid.length(); i++) {
                String substring = grid.substring(i, i + len);

                if (substring.equals(firstPattern)) {
                    firstMatch = 1;
                    break;
                }
            }
            if (firstMatch == 1) {
                break;
            }
            j++;
        }
        if (j >= G.size()) {
            return "NO";
        }
        j++;
        for (String pattern : P.subList(1, P.size())) {
            String grid = G.get(j);
            String substring = grid.substring(i, i + len);
            if (!substring.equals(pattern)) {
                return "NO";
            }
            j++;

        }
        return "YES";
    }

    public static void main(String[] args) {
        List<String> G = new ArrayList<>();
        //G.add("7283455864");
        //G.add("6731158619");
        //G.add("8988242643");
        G.add("3830589324");
        G.add("2229505813");
        G.add("5633845374");
        //G.add("6473530293");
        //G.add("7053106601");
        //G.add("0834282956");

        List<String> P = new ArrayList<>();
        P.add("9505");
        P.add("3845");
        System.out.println(GridSearch.gridSearch(G, P));
    }


}