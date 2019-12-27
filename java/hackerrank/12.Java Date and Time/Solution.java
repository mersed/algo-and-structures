import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        String[] daysDefined = {
                "",
                "SUNDAY",
                "MONDAY",
                "TUESDAY",
                "WEDNESDAY",
                "THURSDAY",
                "FRIDAY",
                "SATURDAY"
        };

        Calendar c = Calendar.getInstance();
        c.set(year, month-1, day);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

        return daysDefined[dayOfWeek];
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        int month = 12;
        int day = 25;
        int year = 2018;

        String res = Result.findDay(month, day, year);

        System.out.println(res);
    }
}
