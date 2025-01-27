import java.util.ArrayList;
import java.util.List;

class SpiralMatrix{
  public static void main(String[] args) {
    int[][] arr = {
      {1, 2, 3, 4},
      {5, 6, 7, 8},
      {9, 10, 11, 12}
      
    };
    List<Integer> ans = spiralOrder(arr);
    System.out.println(ans);
  }
    public static List<Integer> spiralOrder(int[][] matrix) {
      // take four corner of the matrix
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length -1;
        List<Integer> ans = new ArrayList<>();
        while (top <= bottom && left <= right) {
          // move left to right
          for(int i = left; i <= right; i++) {
            ans.add(matrix[top][i]);
          }
          top++;

          // move top to bottm
          for(int i = top; i <= bottom; i++) {
            ans.add(matrix[i][right]);
          }
          right--;

          // move right to left
          if(top <= bottom) {
            for(int i = right; i >= left; i--) {
              ans.add(matrix[bottom][i]);
            }
            bottom--;
          }
          
          //move bottom to top
          if(left <= right) {
            for(int i = bottom; i >= top; i--) {
              ans.add(matrix[i][left]);
            }
            left++;
          }
          
        }
        return ans;
    }
  
}