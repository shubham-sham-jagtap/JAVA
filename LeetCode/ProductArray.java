package LeetCode;

import java.util.Arrays;

// Given an integer array nums, return an array answer such that answer[i] is equal to
// the product of all the elements of nums except nums[i].

public class ProductArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] ans = productExceptSelf(arr);
        System.out.println(Arrays.toString(ans)); 
    }   
    
    
        static int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int[] output = new int[n];
            int prefix = 1;
            int postfix = 1;
    
            // Initialize the output array with 1s
            for (int i = 0; i < n; i++) {
                output[i] = 1;
            }
    
            // Calculate the prefix product
            for (int i = 0; i < n; i++) {
                output[i] = prefix;
                prefix *= nums[i];
            }
    
            // Calculate the postfix product
            for (int i = n - 1; i >= 0; i--) {
                output[i] *= postfix;
                postfix *= nums[i];
            }
    
            return output;
        }
    
    
}

//code done - need to understand the logic


