import java.util.Arrays;

public class Selection {
  public static void main(String[] args) {
    int[] arr = {1,2, 9, 10, 3, 6, 5, 11, 7};
    selection(arr);
    System.out.println(Arrays.toString(arr));
  }
  static void selection(int[] nums) {
    for(int i = 0; i < nums.length; i++) {
      int last = nums.length - i - 1;
      int maxIndex = getMaxIndex(nums, 0, last);
      int temp = nums[last];
      nums[last] = nums[maxIndex];
      nums[maxIndex] = temp;
    }
    

  }

  static int getMaxIndex(int[] nums, int start, int end) {
    int max = start;
    for(int i = start; i <= end; i++) {
      if(nums[max] < nums[i]) {
        max = i;
      }
    }
    return max;
  }
}


