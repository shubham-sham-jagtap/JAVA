package LeetCode;
// https://leetcode.com/problems/find-in-mountain-array/
public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(search(arr, target));
    }

    public static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int first = orderAgnosticBS(arr, target, 0, peak);
        if(first != -1) {
           return first ;
        }
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    public static int peakIndexInMountainArray(int[] nums) {
        int start = 0;
        int end = nums.length -1;

        while ((start < end)) {
            int mid = start + (end - start)/2;
            if(nums[mid] > nums[mid + 1]) {
                end = mid;
            } else if(nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int orderAgnosticBS(int[] nums, int target, int start, int end) {
        boolean isAsc = nums[start] < nums[end];

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (nums[mid] == target) {
                return mid;
            }
            if(isAsc) {
                if(target < nums[mid]) {
                    end = mid - 1;
                } else if(target > nums[mid]) {
                    start = mid + 1;
                }
            } else {
                if(target < nums[mid]) {
                    start = mid + 1;
                }else if ( target > nums[mid]) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
