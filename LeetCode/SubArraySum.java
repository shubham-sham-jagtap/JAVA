package LeetCode;

public class SubArraySum {
  
  public static int subarraySum(int[] nums, int k) {
    int count = 0;

        // Iterate through each possible starting point of the subarray
        for (int start = 0; start < nums.length; start++) {
            int sum = 0;

            // Calculate the sum of subarrays starting from 'start'
            for (int end = start; end < nums.length; end++) {
                sum += nums[end];

                // If the sum equals k, increment the count
                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
  }

  public static void main(String[] args) {
    int[] arr = {1,-1,0};
    int k = 0;
    System.out.println(subarraySum(arr, k));
  }
}
