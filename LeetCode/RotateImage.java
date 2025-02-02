package LeetCode;

import java.util.Arrays;

public class RotateImage {
  public static void main(String[] args) {
    int[][] matrix = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };
    rotate(matrix);
  }
  public static void rotate(int[][] matrix) {
      int start = 0, end = matrix.length - 1;
      while(start < end) {
        for(int i = start; i <= end; i++) {
          int temp = matrix[start][i];
          matrix[start][i] = matrix[end][i];
          matrix[end][i] = temp;
        }
        start++;
        end--;
      }  
      System.out.println(Arrays.deepToString(matrix));
  }
}
