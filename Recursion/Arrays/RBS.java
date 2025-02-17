public class RBS {
  public static void main(String[] args) {
    int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
    System.out.println(search(arr, 7, 0, arr.length - 1));
  }

  public static int search(int[] nums, int target, int s, int e) {
    int m = s + (e - s) / 2;
    //base condition
    if (target == nums[m]) {
      return m;
    } else if (nums[s] <= nums[m]) {
      if(target >= nums[s] & target <= nums[m]) {
        return search(nums, target, s, m - 1);
      } else {
        return search(nums, target, m + 1, e);
      }
    } else if (target >= nums[m] & target <= nums[e]) {
      return search(nums, target, m + 1, e);
    } else {
      return search(nums, target, s, m - 1);
    }
  }
}