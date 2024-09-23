public class StringExample {
    public static void main(String[] args) {
        // String result = greeting();
        // System.out.println(result);

        String message = myGreet("Shubham");
        System.out.println(message);
    }

    static String myGreet(String name) {
        String greet = "hello" + name;
        return greet;
    }

    static String greeting() {
        String greet = "Hello, I am Shubham";
        return greet;
    }
}
