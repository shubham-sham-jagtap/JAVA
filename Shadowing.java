public class Shadowing {
    static int x = 20; // this will be shadowed at line 6
    public static void main(String[] args) {
        System.out.println(x); // 20
        int x;
        // Ayatem.out.println(x);  -  scope will begin when vale is initialised
        x = 80;
        System.out.println(x); // 80
        fun();
    }
    static void fun() {
        System.out.println(x); //20
    }
}
