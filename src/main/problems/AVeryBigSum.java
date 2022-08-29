package main.problems;

import java.util.List;

public class AVeryBigSum {
    public static long aVeryBigSum(List<Long> ar) {

        long sumArray = 0;

        for (Long element : ar) {
            sumArray += element;
        }
        return sumArray;
    }
}
