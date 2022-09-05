package main.problems;

public class NumberLineJumps {
    public static String kangaroo(int x1, int v1, int x2, int v2) {

        if ((v2 < v1) && ((x2 - x1) % (v2 - v1) == 0)) {
            return "YES";
        }
        return "NO";
    }
}