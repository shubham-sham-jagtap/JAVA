package Arrays;

public class Findelement {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
    System.out.println(find(arr, 10, 0));
  }

  static boolean find(int[] nums, int target, int index) {
    if(index == nums.length) {
      return false;
    } else {
      return (nums[index] == target || find(nums, target, index + 1));
    }
  }
}
