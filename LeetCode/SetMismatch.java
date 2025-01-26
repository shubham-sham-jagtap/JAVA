import java.util.Arrays;

public class SetMismatch {
  // https://leetcode.com/problems/set-mismatch/
  public static void main(String[] args) {
    int[] arr = {2,1,2,4};
    System.out.println((Arrays.toString(findErrorNums(arr))));
  }
  public static int[] findErrorNums(int[] nums) {
    int i =0;
    while(i < nums.length) {
     int correct = nums[i] - 1;
     if(nums[i] != nums[correct]) {
         int temp = nums[correct];
         nums[correct] =  nums[i];
         nums[i] = temp;
     } else {
         i++;
     }
    } 

    // int[] arr = new int[2];
    for (int index = 0; index < nums.length; index++) {
     if(nums[index] != index + 1) {
         return new int[] {nums[index], index + 1};
     }
    }
    return new int[] {-1, -1};
    // return arr;
 }
}
