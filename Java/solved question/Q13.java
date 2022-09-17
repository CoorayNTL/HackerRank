public class Q13 {
    public static void main(String[] args) {
        int i = 100;
        String s = String.valueOf(i);
        System.out.println(i);// 300 because + is binary plus operator
        System.out.println(s + 100);// 200100 because + is string concatenation operator
    }
}
