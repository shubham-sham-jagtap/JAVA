package Linear_Search.Code;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 10, 3, 34, 0, 25, 2};
        int ans = min(arr);
        System.out.println(ans);
    }

    static int min(int[] arr) {
        if(arr.length == 0) {
            return -1;
        }
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++ ){
            if(arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;

    }
}
