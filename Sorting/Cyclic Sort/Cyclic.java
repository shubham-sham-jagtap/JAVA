import java.util.Arrays;

class Cyclic {
  public static void main(String[] args) {
    int[] arr = {5, 4, 3, 2, 1};
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }
  // My logic 
  public static void cyclic(int[] nums) {
    for(int i = 1; i <= nums.length; i++) {
      if(nums[i-1] != i) {
        int temp = nums[nums[i - 1] - 1];
        nums[nums[i-1] - 1] = nums[i - 1];
        nums[i - 1] = temp;
      }
    }
  }
  // Kunal's Logic 
  public static void sort(int[] nums) {
    int i = 0;
    while (i < nums.length) {
      int correct = nums[i] - 1;
      if(nums[i] != nums[correct]){
        swap(nums, i, correct);
      } else {
        i++;
      }
    }
  }
  public static void swap(int[] nums, int first, int second) {
    int temp = nums[first];
    nums[first] = nums[second];
    nums[second] = temp;
  }
}