
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 23, 12, 34, 22, 14, -5, 20};
        int target = 34;
        int ans = LinearSearch(nums, target);
        System.out.println(ans);
    }

    //Search in the array: return the index if item found
    //other wise if item not found return -1
    static int LinearSearch(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }

        for(int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(target == element) {
                return index;
            }
        }

        return -1;
    }

}
