package Linear_Search.Code;
// its a leet code queston
public class EvenDigits {
    public static void main(String[] args) {
        //Find even number of digits in an array
        int[] arr = {1, 2, 12, 23, 123, 453, 4567, 12254};
        int ans = FindNumbers(arr);
        System.out.println(ans);
    }
    static int FindNumbers(int[] nums) {
        int count = 0;
        for(int num : nums) {
            if(even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digit(num);
        return numberOfDigits % 2 == 0;
    }

    static int digit(int num) {
        int count = 0;
        while(num > 0) {
            count++;
            num = num / 10; // num /= 10
        }
        return count;
    }
}
