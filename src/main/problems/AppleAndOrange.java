package main.problems;

import java.util.List;

public class AppleAndOrange {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

        int cApples = 0, cOranges = 0;

        for (Integer e : apples) {
            if (e + a >= s && e + a <= t) {
                cApples += 1;
            }
        }

        for (Integer e : oranges) {
            if (e + b >= s && e + b <= t) {
                cOranges += 1;
            }
        }

        System.out.println(cApples);
        System.out.println(cOranges);
    }
}
