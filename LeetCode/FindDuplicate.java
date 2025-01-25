public class FindDuplicate {
  //https://leetcode.com/problems/find-the-duplicate-number/description/
  public static void main(String[] args) {
    int[] arr = {3,3,3,3,3};
    System.out.println(findDuplicate(arr));
  }
  public static int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length) {
          int correct = nums[i] - 1;
          if(nums[correct] != nums[i]) {
            int temp = nums[correct];
            nums[correct] = nums[i];
            nums[i] = temp;
          } else {
            i++;
          }
        }

        for(int index = 0; index < nums.length; index++) {
          if(nums[index] != index + 1) {
            return nums[index];
          }
        }
        return nums.length;
  }
}
