package Linear_Search.Code;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {22, 34, 12, 56},
            {11, 24, 25, 26, 27},
            {32, 9}
        };
        int target = 9;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]){
                    return new int[] {row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
