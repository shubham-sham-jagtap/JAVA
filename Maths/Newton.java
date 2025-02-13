public class Newton {
  public static void main (String[] args) {
    int n = 40;
    System.out.println(newtonSQRT(n));
  }

  public static double newtonSQRT(int n) {
    double x = n;
    double root;
    while(true) {
      root = (0.5 * (x + n / x));
      if(Math.abs( root - x) < 0.5) {
        break;
      } else {
        x = root;
      }
    }
    return root;
  }
}
