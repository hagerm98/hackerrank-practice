package main.problems;

public class Staircase {
    public static void staircase(int n) {

        // n = num spaces + num symbol
        //    #
        //   ##
        //  ###
        // ####

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }

            System.out.println();
        }
    }
}
