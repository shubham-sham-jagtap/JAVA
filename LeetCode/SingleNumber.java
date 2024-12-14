public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,2};
        int ans = singleNumber(arr);
        System.out.println(ans);
    }

    public static int singleNumber(int[] nums) {
        int allXOR = nums[0];
        for(int i = 1; i < nums.length; i++) {
            allXOR = allXOR ^ nums[i];
        }
        return allXOR;
    }
}
