package com.practice;

import java.util.List;

public class EmaSuperComputer {

    public static int twoPluses(List<String> grid) {
        // Write your code here
        int rows = grid.size();
        int col = grid.get(0).length();
        int firstMax = 0;
        int secondMax = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (grid.get(i).charAt(j) == 'G') {
                    while (true) {

                    }
                }
            }
        }

        return 0;
    }

}
