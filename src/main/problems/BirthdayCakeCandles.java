package main.problems;

import java.util.List;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {

        // [3, 2, 1, 3]
        // [3, 4, 2, 4, 7, 5, 6, 7]

        int tallestCandle = 0;
        int numCandles = 0;

        for (Integer element : candles) {

            if (element > tallestCandle) {
                tallestCandle = element;
                numCandles = 1;
            } else if (element == tallestCandle) {
                numCandles += 1;
            }
        }

        return numCandles;
    }
}
