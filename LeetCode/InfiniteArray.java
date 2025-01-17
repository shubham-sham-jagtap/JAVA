// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
// Find position of an element in a sorted array of infinite numbers.
// Given a sorted array arr[] of infinite numbers. The task is to search for an element k in the array.
// Examples:
// Input: arr[] = [3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170], k = 10
// Output: 4
// Explanation: 10 is at index 4 in array.
// Input: arr[] = [2, 5, 7, 9], k = 3
// Output: -1
// Explanation: 3 is not present in array.
public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 100, 101, 200, 205, 245, 265, 321};
        int target = 10;
        System.out.println(ans(arr, target));
    }
    public static int ans(int[] nums, int target) {
        int start = 0;
        int end = 1;
        
       while (target > nums[end]) {
        int temp = end + 1;
        end = end + (end - start + 1);
        start = temp;
       }

       int ans = binarySearch(nums, target, start, end);
       return ans;
    }

    public static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(target < nums[mid]) {
                end = mid - 1;
            } else if(target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
