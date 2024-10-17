package Binary_Search;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int[] arr = {30, 22, 20, 18, 16, 15, 11, 10, 8, 5, 1, -5};
        int[] arr = {-5, 1, 5, 8, 10, 11, 12, 20, 22, 33, 45, 50};
        int target = -5;
        int ans = OrderAgnosticBS(arr, target);
        System.out.println(ans);

    }

    static int OrderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start)/2;
            
            if(target == arr[mid]) {
                return mid;
            }

            if(isAsc) {
                if(target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            
        }
        return -1;
    }
}
