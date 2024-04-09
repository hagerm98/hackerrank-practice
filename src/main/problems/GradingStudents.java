package main.problems;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
       List<Integer> rounded = new ArrayList<>();
        for (Integer grade : grades) {

            if (grade < 38) {
                rounded.add(grade);

            } else {
                int n = (grade / 5 + 1) * 5;
                int mod5 = grade % 5;

                if (mod5 >= 3) {
                    rounded.add(n);

                } else {
                    rounded.add(grade);
                }
            }
        }
        return rounded;
    }
}
