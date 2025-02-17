import java.util.Arrays;

public class Bubble {
  public static void main (String[] args) {
    int[] arr = {4, 3, 2, 1};
    sort(arr);
    System.err.println(Arrays.toString(arr));
  }

  public static void sort(int[] nums) {
    helper(nums, nums.length - 1, 0);
  }

  public static void helper(int[] nums, int r, int c) {
    if(r == 0) {
      return;
    } else if ( c < nums.length - 1 && nums[c]  > nums[c + 1]) {
      int temp = nums[c];
      nums[c] = nums[c+1];
      nums[c + 1] = temp;
      helper(nums, r, c + 1);
    } else {
      helper(nums, r - 1, 0);
    }
  }
}