import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Q. take input of 2 numbers and print the sum
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of the numbers are : " + sum);
    }
}