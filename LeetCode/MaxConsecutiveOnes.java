public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        int ans = findMaxConsecutiveOnes(arr);
        System.out.println(ans);
    }

    public static int findMaxConsecutiveOnes(int[] nums){
        int count = 0; // Current streak of consecutive 1s
    int maxCount = 0; // Maximum streak of consecutive 1s

    for (int num : nums) {
        if (num == 1) {
            count++; // Increment streak
            maxCount = Math.max(maxCount, count); // Update maximum if needed
        } else {
            count = 0; // Reset streak when a 0 is encountered
        }
    }
    return maxCount;
    }
}
