public class GCD_LCM {
  public static void main(String[] args) {
    System.out.println(lcm(4, 8)); 
    System.out.println(gcd(4, 8)); 
  }
  public static int gcd(int a, int b) {
    if(a == 0) {
      return b;
    } else {
      return gcd(b % a, a);
    }
  }
  public static int lcm(int a, int b) {
    return (a * b)/gcd(a, b);
  }
}
