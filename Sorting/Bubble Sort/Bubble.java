import java.util.Arrays;

public class Bubble {

  public static void main(String[] args) {
    int[] arr = {1, 3, 2, 4, 5, 8, 6};
    bubble(arr);
    System.out.println(Arrays.toString(arr));
  }
  static void bubble(int[] nums) {
    boolean swaped;
    //run the steps n - 1 times
    for(int i = 0; i <nums.length; i++) {
      swaped = false;
      //for each step max item will come at last index
      for(int j = 1; j < nums.length - i; j++) {
        // swap if the item is smaller than the privious element
        if(nums[j] < nums[j - 1]) {
          //swap 
          int temp = nums[j];
          nums[j] = nums[j-1];
          nums[j - 1] = temp;
          swaped = true;
        }
      }
      //If you didnot swap for a particular item of i, that means the array is sorted hence stop the execution 
      if(!swaped) { //!false == true, swapped == false
        break;
      }
    }
  }
}
