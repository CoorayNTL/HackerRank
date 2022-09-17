import java.util.InputMismatchException;
import java.util.Scanner;

public class Q19 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {

            try {

                int c = a / b;
            } catch (InputMismatchException ex) {
                System.out.println(
                        ex);
            }
        } catch (ArithmeticException ex) {
            System.out.println(ex);
        }

        sc.close();
    }
}
/*
 * try {
 * 
 * int d = sc.nextInt(); // we give any float value as input
 * int e = sc.nextInt();
 * } catch (InputMismatchException ex) {
 * System.out.println(
 * ex);
 * }
 * int a = sc.nextInt();
 * int b = sc.nextInt();
 * try {
 * int c = a / b;
 * } catch (ArithmeticException e) {
 * System.out.println(e);
 * } finally {
 * System.out.println(b);
 * }
 * 
 * /// String S = sc.nextLine();
 * try {
 * 
 * int f = sc.nextInt(); // we give any float value as input
 * int g = sc.nextInt();
 * } catch (InputMismatchException ex) {
 * System.out.println(
 * ex);
 * }
 */