// 852. Peak Index in a Mountain Array
// You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
// Return the index of the peak element.
// Your task is to solve it in O(log(n)) time complexity.

// Example 1:
// Input: arr = [0,1,0]
// Output: 1

package LeetCode;

public class Mountain {
    public static void main(String[] args) {
        int[] arr = {0,2,3,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        
        while (start < end) {
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if(arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } 
        }
        return start; //or return end as both are equal at the end
    }
}
