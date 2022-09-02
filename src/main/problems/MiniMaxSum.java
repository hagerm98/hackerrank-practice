package main.problems;

import java.util.List;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {

        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;
        long sum = 0;

        for (Integer element : arr) {

            if (element > max) {
                max = element;
            }

            if (element < min) {
                min = element;
            }

            sum += element;
        }

        System.out.print((sum - max) + " " + (sum - min));
    }
}
