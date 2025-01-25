import java.util.ArrayList;
import java.util.List;

public class FindAllMissing {
  public static void main(String[] args) {
    int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
    List<Integer> ans = findDisappearedNumbers(arr);
    System.out.println(ans);
  }

  public static List<Integer> findDisappearedNumbers(int[] nums) {
    int i = 0;
    while (i < nums.length) {
      int correct = nums[i] - 1;
      if(nums[correct]!=nums[i]) {
          int temp = nums[correct];
          nums[correct] = nums[i];
          nums[i] = temp;
      } else{
        i++;
      }
  }  
    List<Integer> ans = new ArrayList<>();
    for (int index = 0; index < nums.length; index++) {
      if (nums[index] != index + 1) {
        ans.add(index + 1);
      }
    }
    return ans;
  }
}
