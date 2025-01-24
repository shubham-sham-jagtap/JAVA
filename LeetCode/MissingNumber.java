public class MissingNumber {
//https://leetcode.com/problems/missing-number/description/
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 9};
        int ans = missingNumberCyclic(arr);
        System.out.println(ans);
    }

    //XOR approch
    public static int missingNumber(int[] nums) {
        int allXOR = 0;
        for(int i = 0; i <= nums.length; i++) {
           allXOR = allXOR ^ i;
        }

        for(int num : nums) {
            allXOR = allXOR ^ num;
        }

        return allXOR;
    }

    //Cyclic Sort approch
    public static int missingNumberCyclic(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if(nums[i] < nums.length && nums[correct] != nums[i]) {
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            }
            i++;
        }

        for(int index = 0; index < nums.length; index++) {
            if(nums[index] != index) {
                return index;
            }
        }
        return nums.length;
    }
}
