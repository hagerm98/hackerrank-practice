package main.problems;

import java.util.List;

public class CompareTheTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 0; i < a.size(); i++) {

            if (a.get(i) > b.get(i)) {
                aliceScore += 1;
            } else if (b.get(i) > a.get(i)) {
                bobScore +=1;
            }
        }

        return List.of(aliceScore, bobScore);
    }
}
