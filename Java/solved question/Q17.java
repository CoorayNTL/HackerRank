
/*String AA is "hello" and BB is "java". 
AA has a length of 55, and BB has a length of 44; the sum of their lengths is 99. 
When sorted alphabetically/lexicographically, "hello" comes before "java"; therefore, AA is not larger than BB and the answer is NO.
*/
import java.util.*;

public class Q17 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();

        System.out.println(A.length() + B.length());

        // if (A.length() > B.length()) {
        // System.out.println("No");
        // }

        if (A.compareTo(B) < 0 || A.compareTo(B) == 0) {
            System.out.println("No");
        }
        // capitalize first letter

        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase()
                + B.substring(1));
        ;
    }
}