package LeetCode;

public class CheckifArrayIsSortedAndRotated {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 3, 6};
        boolean ans = check(arr);
        System.out.println(ans);
    }

    public static boolean check(int[] nums) {
        int breakPoint = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] > nums[i + 1]) {
                breakPoint++;
            }
            if(breakPoint > 1) {
                return false;
            }
        }
        if(breakPoint == 1) {
            if(nums[nums.length-1] > nums[0]) {
                return false;
            }
        }
        return true;
    }
}
