import java.util.Scanner;

public class HellpCode7 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");

        System.out.print("enter your string value: ");
        Scanner sc = new Scanner(System.in);
        sb.append(sc.nextLine());

        System.out.print("enter input data: ");
        String inputdata = sc.nextLine();
        sb.append(inputdata);
        String str = sb.toString();
        System.out.println("new string :" + str);
        sc.close();

    }
}