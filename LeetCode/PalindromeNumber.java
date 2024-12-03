package LeetCode;

import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        int a = in.nextInt();
        boolean ans = isPalindrome(a);
        System.out.println(ans);
    }
    
    public static boolean isPalindrome(int x) {
        
        int rev = 0;
        int dup = x;
        while (x > 0) {
            int digit = x % 10;
            rev = (rev*10) + digit;
            x = x/10;
        }
        if(rev == dup) {
            return true;
        }
        else {
            return false;
        }
    }
}
