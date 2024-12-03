
import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int ans = reverse(a);
        System.out.println(ans);
    }

    
    
    public static int reverse(int x) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            x = x/10;

            if(rev > max/10 || rev == max/10 && digit >= max%10 ) {
                return 0;
            }
            if(rev < min/10 || rev == min/10 && digit <= min%10 ) {
                return 0;
            }
            rev = (rev * 10) + digit;
        }
        return rev;
}
}