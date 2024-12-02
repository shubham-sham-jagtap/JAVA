
import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int ans = reverse(a);
        System.out.println(ans);
    }

    static int reverse(int x) {
        int revNum = 0;
        while(x > 0) {
            int rem = x % 10;
            revNum = (revNum * 10) + rem;
            x = x/10;
        }
        if(x < 0) {
            x = x * (-1);
            while (x > 0) {
                int rem = x % 10;
                revNum = (revNum * 10) + rem;
                x = x/10;
            }
            return (-1)*revNum;
        }
        return revNum;
    }
}
