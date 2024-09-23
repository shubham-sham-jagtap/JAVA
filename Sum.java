import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
    } 


    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = in.nextInt();

        System.out.println("Enter 2nd number: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        return sum;
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.print("Sum of two number is: " + sum);

    }
    
}
