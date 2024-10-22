package Binary_Search;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 10, 14, 16, 18, 20};
        int target = 15;
        int ans = floo(arr, target);
        System.out.println(ans);
    }

    static int floo(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] == target)  {
                return mid;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else if(target < arr[mid]) {
                end = mid - 1;
            }
        }
        return end;
    }
    
}
