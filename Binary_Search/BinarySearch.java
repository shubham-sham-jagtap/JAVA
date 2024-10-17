package Binary_Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-12, -10, -9, 1, 2, 3, 7, 9, 12, 22, 29, 49, 44, 49, 57, 66};
        int target = -12;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    
    // Return the index
    //return -1 if it doesnot exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find middle element
            // int mid = (start + end)/2 //might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start)/2;

            if(target < arr[mid]) {
                end = mid - 1;
            }else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1; 
    }
}
