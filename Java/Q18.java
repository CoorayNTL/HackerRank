import java.util.Scanner;

public class Q18 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();
        // Scanner sc = new Scanner(System.in);
        // StringBuilder sb = new StringBuilder();
        // // String S = sc.nextLine();
        // sb.substring(sc.nextLine());
        System.out.println(S.substring(start, end));
        // System.out.println(substring(start ,end));
    }

    private static char[] substring(int i, int j) {
        return null;
    }
}
