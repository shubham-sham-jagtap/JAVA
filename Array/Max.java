public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 4, 15, 9};
        // max(arr);
        System.out.println(maxRange(arr, 0, 3));
    }

    static int maxRange(int[] arr, int start, int end) {
        int maxVal = arr[start];
        for(int i = start; i < end; i++) {
            if(arr[i] > maxVal) {
                maxVal = arr[i];
            }

        }
        return maxVal;
    }
    // static int max(int[] arr) {
    //     int maxVal = arr[0];
    //     for(int i = 1; i < arr.length; i++) {
    //         if(arr[i] > maxVal) {
    //             maxVal = arr[i];
    //         }

    //     }
    //     return maxVal;
    // }
}
