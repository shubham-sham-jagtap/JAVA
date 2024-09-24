
import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        // String result = greeting();
        // System.out.println(result);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.next();
        String message = myGreet(name);
        System.out.println(message);
    }

    static String myGreet(String name) {
        String greet = "hello " + name;
        return greet;
    }

    static String greeting() {
        String greet = "Hello, I am Shubham";
        return greet;
    }
}
