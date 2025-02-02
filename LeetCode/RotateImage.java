package LeetCode;

import java.util.Arrays;

public class RotateImage {
  public static void main(String[] args) {
    int[][] matrix = {
      {5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}
    };
    rotate(matrix);
  }
  public static void rotate(int[][] matrix) {
      int start = 0, end = matrix.length - 1;
      while(start < end) {
        int[] temp = matrix[start];
            matrix[start] = matrix[end];
            matrix[end] = temp;
            start++;
            end--;
      }  
      for(int row = 0; row < matrix.length; row++) {
        for(int cols = row + 1; cols < matrix.length; cols++) {
          int temp = matrix[row][cols];
          matrix[row][cols] = matrix[cols][row];
          matrix[cols][row] = temp;
        }
      }
      System.out.println(Arrays.deepToString(matrix));
  }
}
