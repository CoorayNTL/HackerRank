import java.util.Scanner;
import sun.security.util.Length;

/*Java Scanner hasNext() Method
The hasNext() is a method of Java Scanner class which returns true if this scanner has another token in its input. 
There are three different types of Java Scanner hasNext() method which can be differentiated depending on its parameter. These are:

Java Scanner hasNext () Method
Java Scanner hasNext (String pattern) Method
Java Scanner hasNext(Pattern pattern) Method
1.Java Scanner hasNext () Method:
It is a Scanner class method which returns true if this scanner has another token in its input. 
This method may block while waiting for input to scan.

2.Java Scanner hasNext (String pattern) Method:
It is a Scanner class method which returns true if the next token matches the pattern constructed from the specified string.

3.Java Scanner hasNext (Pattern pattern) Method:
It is a Scanner class method which returns true if the next complete token matches the specified pattern.


Syntax
Following are the declarations of hasNext() method:

public boolean hasNext()  
public boolean hasNext(String pattern)  
public boolean hasNext(Pattern pattern)  
Parameter
Data Type	Parameter	Description	Required/Optional
String	pattern	It is a string specifying the pattern to scan.	Required
Pattern	pattern	It is the pattern to scan for specified string.	Required
Returns
Method	Returns
hasNext()	This method returns true if and only if this scanner has another token.
hasNext(String pattern)	This method returns true if and only if this scanner has another token matching the specified pattern.
hasNext(Pattern pattern)	This method returns true if and only if this scanner has another token matching the specified pattern. */

public class Q11 {
    public static void main(String args[]) {
        /*
         * Hello world
         * I am a file
         * Read me until end-of-file.
         */

        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (sc.hasNext()) {
            String s = sc.nextLine();

            System.out.println(i + "  " + s);
            i++;
        }

        // String s[] = { "Hello world", "I am a file", "Read me until end-of-file." };

        // for (int i = 0; i < s.length; i++)
        // System.out.println(s[i]);

    }
}
