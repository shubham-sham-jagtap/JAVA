package LeetCode;

public class RotatedArray {
  public static void main(String[] args) {
    int[] arr = {2,2,2,3,2,2,2};
    int target = 3;
    System.out.println(search(arr, target));
  }
  public static boolean search(int[] nums, int target) {
        int pivot = pivot(nums); 
        if(pivot == -1) {
          return binarySearch(nums, target, 0,nums.length - 1);
        }
        if (nums[pivot] == target) {
          return true;
        }
        if(nums[0] <= target) {
          return binarySearch(nums, target, 0, pivot - 1);
        }  else {
          return binarySearch(nums, target, pivot + 1, nums.length - 1);
        } 
        
  }
  public static int pivot(int[] arr)  {
    int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
  }

  public static boolean binarySearch(int[] arr, int target, int start, int end) {
    while(start <= end) {
      // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
      int mid = start + (end - start) / 2;

      if (target < arr[mid]) {
          end = mid - 1;
      } else if (target > arr[mid]) {
          start = mid + 1;
      } else {
          // ans found
          return true;
      }
  }
  return false;
  }
}
