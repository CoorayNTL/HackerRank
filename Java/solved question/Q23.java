import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

class Singleton {
    private volatile static Singleton instance;
    public static String str;

    private Singleton() {
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
    }

    public static Singleton getSingleInstance() {
        // if (instance == null) {
        // synchronized (Singleton.class) {
        if (instance == null) {
            instance = new Singleton();
        }
        // }
        // }
        return instance;

    }

    void sample() {
        System.out.println("Hello I am a singleton! Let me say " + str + " to you");
    }
}

public class Q23 {
    public static void main(String args[]) {
        for (int i = 0; i < 1; i++) {
            Singleton.getSingleInstance().sample();
            ;
        }
    }
}