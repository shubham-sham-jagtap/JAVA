import java.util.Arrays;

// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

class RotateArray{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int k = 2;
        int[] arr = rotate(a, k);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] rotate(int[] nums, int k) {
        k = k % nums.length;
        int n = nums.length;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        return nums;
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        }
    }
