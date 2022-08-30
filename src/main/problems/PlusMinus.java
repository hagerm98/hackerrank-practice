package main.problems;

import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {

        float posElements = 0;
        float negElements = 0;
        float zero = 0;

        for (Integer element : arr) {
            if (element > 0) {
                posElements += 1;
            } else if (element < 0) {
                negElements += 1;
            } else {
                zero += 1;
            }
        }

        System.out.println(posElements / arr.size());
        System.out.println(negElements / arr.size());
        System.out.println(zero / arr.size());
    }
}
