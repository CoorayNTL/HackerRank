package Java;

import java.util.Scanner;

public class Q5 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1;
        int x;
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            s1 = sc.next();
            x = sc.nextInt();
            System.out.printf("%-14s %03d\n", s1, x);
        }
        // for (i = 0; i < 3; i++) {

        // System.out.printf("%-14s %03.2f\n" + s1 + x);
        // }
        System.out.println("================================");

    }
}
