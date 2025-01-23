import java.util.Arrays;

class Cyclic {
  public static void main(String[] args) {
    int[] arr = {5, 4, 3, 2, 1};
    cyclic(arr);
    System.out.println(Arrays.toString(arr));
  }
  public static void cyclic(int[] nums) {
    for(int i = 1; i <= nums.length; i++) {
      if(nums[i-1] != i) {
        int temp = nums[nums[i - 1] - 1];
        nums[nums[i-1] - 1] = nums[i - 1];
        nums[i - 1] = temp;
      }
    }
  }
}