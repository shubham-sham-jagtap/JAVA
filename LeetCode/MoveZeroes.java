import java.util.Arrays;
//Given an integer array nums, move all 0's to the end of it while maintaining
//  the relative order of the non-zero elements.

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 0, 19, 20};
        int[] ans = moveZeroes(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] moveZeroes(int[] nums) {
        int a = 0;
        for(int i = 0; i <= nums.length - 1; i++) {
            if(nums[i] != 0) {
                nums[a] = nums[i];
                a++;
            }
        }
        while (a < nums.length) {
            nums[a] = 0;
            a++;
        }
        return nums;
    }
}
