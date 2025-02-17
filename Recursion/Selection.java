import java.util.Arrays;

public class Selection {
  public static void main(String[] args) {
    int[] arr = {4, 3, 2, 1};
    sort(arr, arr.length , 0, 0);
    System.out.println(Arrays.toString(arr));
  }
  public static  void sort(int[] nums, int r, int c, int max) {
    if(r == 0){
      return;
    } else if (c < r) {
      if(nums[c] > nums[max]) {
        sort(nums, r, c + 1, c);
      } else {
        sort(nums, r, c + 1, max);
      }
    } else {
      int temp = nums[max];
      nums[max] = nums[r - 1];
      nums[r - 1] = temp;
      sort(nums, r - 1, 0, 0);
    }
  }
}
