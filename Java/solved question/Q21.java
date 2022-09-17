 
 public class Q21{
 public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
 
        StringBuilder input1 = new StringBuilder();
 
        // append a string into StringBuilder input1
        input1.append(input);
 
        // reverse StringBuilder input1
        input1.reverse();
 if(input.equals(input1.toString())){
    system.out.println("Yes");
    //System.out.println(input1);
 }else{
    System.out.println("No");
}
        // print reversed String
       // System.out.println(input1);
    }
}