package LeetCode;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 2, 3, 4, 5};
        int val = 2;
        int ans = removeElement(arr, val);
        System.out.println(ans);
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
