package Arrays;

public class Findelement {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
    System.out.println(find(arr, 3, 0));
  }

  static int find(int[] nums, int target, int index) {
    if(index == nums.length) {
      return -1;
    } else if(nums[index] == target) {
      return index;
    }
    return find(nums, target, index + 1);
  }
    
}

