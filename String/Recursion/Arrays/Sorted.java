package Arrays;

public class Sorted {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 16, 7};
    System.out.println(sorted(arr, 0));
  }

  static boolean sorted(int[] nums, int index) {
    if(index == nums.length - 1) {
      return true;
    }
    return nums[index] < nums[index + 1] && sorted(nums, index + 1);
  }
}
