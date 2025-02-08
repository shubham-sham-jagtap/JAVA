public class Patterns {
  public static void main(String[] args) {
    // pattern1(4);
    // pattern2(4);
    pattern17(5);
  }
   
  static void pattern30(int n) {
    for( int row = 1; row <= n; row ++) {
      int space = n - row;
      for(int s = 1; s <= space; s++) {
        System.out.print("  ");
      }
      for(int cols = row; cols >= 1; cols--) {
        System.out.print(cols+" ");
      }
      for(int cols = 2; cols <= row; cols++) {
        System.out.print(cols+" ");
      }
      System.out.println();
    }
  }
  static void pattern17(int n) {
    for(int row = 1; row < 2*n; row++) {
      int c = row > n ? 2 * n - row : row;
      for(int s = 1; s <= n- c; s++) {
        System.out.print("  ");
      }
      for(int col = c; col >= 1; col--) { 
        System.out.print(" "+ col);
      }
      for(int col = 2; col <= c; col++) {
        System.out.print(" "+col);
      }
      System.out.println();
    }
    
  }
  static void pattern28(int n) {
    for(int row = 1; row <= 2*n - 1 ; row++) {
      int totalColsInARow = row > n ? 2*n - row : row ;
      int spaces = n- totalColsInARow;
      for(int s = 1; s <= spaces; s++) {
        System.out.print(" ");
      }
      for(int col = 1; col <= totalColsInARow; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  

  static void pattern5(int n) {
    for(int row = 1; row <= 2*n-1; row++) {
      if(row > n) {
        for(int col = 1; col <= n - (row - n); col ++) {
          System.out.print("* ");
        }
        System.out.println();
      } else { for(int col = 1; col <= row; col++) {
        System.out.print("* ");
      }
      System.out.println();}
      
    }
  }
  static void pattern4(int n) {
    for(int row = 1; row <= n; row++) {
      int a = 1;
      for(int col = 1; col <= row; col++) {
        System.out.print(a+" ");
        a++;
      }
      System.out.println();
    }
  }
  public static void pattern1(int n){
    for(int row = 1; row <= n; row++) {
      for(int col = 1; col <= n; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void pattern2(int n) {
    for(int row = 1; row <= n; row++) {
      for(int col = 1; col <= row; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void pattern3(int n) {
    for(int row = 1; row <= n; row++) {
      for(int col = 1; col <=n-row+1; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

 
}
