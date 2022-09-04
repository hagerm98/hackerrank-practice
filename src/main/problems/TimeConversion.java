package main.problems;

public class TimeConversion {
    public static String timeConversion(String s) {

        if (s.endsWith("AM")) {
            String w = s.replace("AM", "");

            if (w.startsWith("12")) {
                return w.replace("12", "00");
            }
            return w;

        } else {
            String w = s.replace("PM", "");

            if (w.startsWith("12")) {
                return w;
            }

            String hours = w.substring(0, 2);
            String hours24 = String.valueOf(Integer.parseInt(hours) + 12);
            return w.replace(hours, hours24);
        }
    }
}
