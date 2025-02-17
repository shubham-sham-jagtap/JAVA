package Recursion;

public class BS {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5 ,6, 11, 22, 34, 99};
    int target = 6;
    System.out.println(search(arr, target, 0, arr.length - 1));
  }

  public static int search(int[] nums, int target, int s, int e) {
    if(s > e) {
      return -1;
    } 

    int mid = s + (e - s) / 2;

    if(target < nums[mid]) {
      return search(nums, target, s, mid - 1);
    } else if (target > nums[mid]) {
      return search(nums, target, mid + 1, e);
    } else {
      return mid;
    }
  }
}
