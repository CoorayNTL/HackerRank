import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        int sum = 0;
        for (int j = 1; j <= n; j++) {
            t = in.nextInt();

            a = in.nextInt();
            b = in.nextInt();
            a = sum;
            for (int i = 1; i <= t; i++) {
                sum += a + (int) Math.pow(2, i - 1) * b;
                System.out.print(sum + " ");
            }
            in.close();
        }
    }
}
