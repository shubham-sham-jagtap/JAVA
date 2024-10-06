package Array;
import java.util.Arrays;
public class PassinginFunctions {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 9};
        System.out.println(Arrays.toString(arr));
        change(arr);
    }

    static void change(int[] num) {
        num[1] = 100;
        System.out.println(Arrays.toString(num));
    }
}
