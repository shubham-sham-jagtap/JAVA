
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter the number : ");
        // int number = in.nextInt();
        for(int i = 100; i < 1000; i++) {
            if(isArmstrong(i)) {
                    System.out.print(i + " ");
                }
                
        }
    }

    static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        while(num > 0){
            int rem = num % 10;
            num = num/10;
            sum += rem*rem*rem; 
        }
        return original == sum;

    }
}
