package main.problems;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BetweenTwoSets {

    public static void main(String[] args) {

        System.out.println("result = " + getTotalX(List.of(2, 4), List.of(16, 32, 96)));

    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {

        int result = 0;

        Set<Integer> bFactors = getFactors(b);

        for (Integer fac : bFactors) {
            if (isDivisibleByAll(fac, a)) {
                result += 1;
            }
        }
        return result;
    }


    private static Set<Integer> getFactors(int number) {

        Set<Integer> factors = new HashSet<>();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }

    private static Set<Integer> getFactors(List<Integer> numbers) {

        if (numbers.isEmpty()) {
            return new HashSet<>();
        }

        Set<Integer> factors = getFactors(numbers.get(0));

        for (Integer number : numbers) {
            factors.retainAll(getFactors(number));
        }
        return factors;
    }

    private static boolean isDivisibleByAll(int number, List<Integer> list) {

        for (Integer element : list) {
            if (number % element != 0) {
                return false;
            }
        }
        return true;
    }
}
