package LeetCode;
// https://leetcode.com/problems/search-in-rotated-sorted-array/
public class RBS {
    public static void main(String[] args) {
        int[] arr = {0,1,2, 3, 4, 5};
        System.out.println(findPivot(arr));
    }

    public static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start)/2;  
            //4 cases
            if(mid < end &&  nums[mid] > nums[mid + 1]) {
                return mid;
            } else if(mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            } else if (nums[start] > nums[mid]) {
                end = mid - 1;
            } else if (nums[start] < nums[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
