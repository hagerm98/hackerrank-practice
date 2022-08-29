package main.problems;

import java.util.List;

public class SimpleArraySum {
    public static int simpleArraySum(List<Integer> ar) {

        int sumArray = 0;

        for (Integer element : ar) {
            sumArray += element;
        }
        return sumArray;
    }
}