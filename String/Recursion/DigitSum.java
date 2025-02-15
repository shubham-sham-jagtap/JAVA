public class DigitSum{
  public static void main(String[] args) {
    int n = 1302;
    System.out.println(digitSum(n));
  }

  public static int digitSum(int n) {
    if(n/10 == 0) {
      return n;
    }
    return digitSum(n/10) + n % 10;
  }
}