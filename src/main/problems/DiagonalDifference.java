package main.problems;

import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {

        int diagonal1 = 0;
        int diagonal2 = 0;

        for (int i = 0; i < arr.size(); i++) {
            diagonal1 += arr.get(i).get(i);
            diagonal2 += arr.get(i).get(arr.size() - 1 - i);
        }

        return Math.abs(diagonal1 - diagonal2);
    }
}

