package LeetCode;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = " ABBA,";
        boolean ans = isPalindrome(str);
        if(ans == true) {
            System.err.println("the String is palindrome");
        }
        else {
            System.out.println("the string is not palindrome");
        }
        
    }

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            char l = s.charAt(left), r = s.charAt(right);

            if(!Character.isLetterOrDigit(l)) {
                left++;
            }
            else if(!Character.isLetterOrDigit(r)) {
                right--;
            }
            else if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                return false;
            }
            else {
                left++;
                right--;
            }
        }
        return true;
    }
}
