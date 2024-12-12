public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 9};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }

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
}
