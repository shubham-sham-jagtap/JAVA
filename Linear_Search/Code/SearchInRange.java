package Linear_Search.Code;

public class SearchInRange {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 55, 46, 23, 34};
        int target = 5;
        int ans = LinearSearch(arr, target, 1, 4);
        System.out.println(ans);
    }

    static int LinearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for(int i = start; i <= end; i++) {
            int element = arr[i];
            if(element == target) {
                return i;
            }

        }
        return -1;
    }
}
