
/*
 * The getDayOfWeek() method of LocalDate class in Java gets the day-of-week
 * field, which is an enum DayOfWeek.
 * 
 * Syntax:
 * 
 * public DayOfWeek getDayOfWeek()
 */

/*Integer valueOf() Method in Java
Difficulty Level : Basic
Last Updated : 14 Dec, 2021
Read
Discuss

1. The java.lang.Integer.valueOf(int a) is an inbuilt method which is used to return an Integer instance representing the specified int value a.

Syntax : 

public static Integer valueOf(int a)
Parameters : The method accepts a single parameter a of integer type representing the parameter whose Integer instance is to be returned.

Return Value : The method returns an Integer instance representing a. */
import java.io.*;

import java.time.LocalDate;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     * 1. INTEGER month
     * 2. INTEGER day
     * 3. INTEGER year
     */

    /**
     * @param month
     * @param day
     * @param year
     * @return
     */
    public static String findDay(int month, int day, int year) {

        int mon = Integer.valueOf(month);
        int dy = Integer.valueOf(day);
        int yr = Integer.valueOf(year);

        // LocalDate date = LocalDate.of(yr, mon, dy);
        return LocalDate.of(yr, mon, dy).getDayOfWeek().toString();
        // return null;
    }

}

public class Q15 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
