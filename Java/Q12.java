
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Q12 {

    static int H;
    static int B;

    static boolean flag = true;
    static { // static block

        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        B = sc.nextInt();

        if (H < 0 || B < 0 || H == 0 || B == 0) {
            flag = false;

        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

    }
}
// end of cl
