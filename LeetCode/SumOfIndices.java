package LeetCode;

import java.util.Arrays;

// Given an array of integers nums and an integer target, return indices of the two numbers such that
//  they add up to target.
public class SumOfIndices {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for(int j = i + 1; j < nums.length; j++) {
                int ans = num + nums[j];
                if(ans == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
