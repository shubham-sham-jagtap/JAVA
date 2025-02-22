// import java.lang.reflect.Array;
import java.util.ArrayList;

public class SubSeq {
  public static void main(String[] args) {
    // ArrayList<String> list = new ArrayList<>();
    // subseq2("", "sakshi");
    System.out.println(subseq2("", "abc"));
    // subseq("","abc");

  }

  public static void subseq(String p, String up) {
    if(up.isEmpty()) {
      System.out.println(p);
      return;
    } 
    char ch = up.charAt(0);
    subseq( p + ch, up.substring(1));
    subseq(p,up.substring(1));
  }

  public static ArrayList<String> subseq1(String p, String up, ArrayList<String> list) {
    if(up.isEmpty()) {
      list.add(p);
      return list;
    } 
    char ch = up.charAt(0);
    subseq1( p + ch, up.substring(1), list);
    subseq1(p,up.substring(1), list);
    return list;
  }
  public static ArrayList<String> subseq2(String p, String up) {
    if(up.isEmpty()) {
      ArrayList<String> list = new ArrayList<>();
      list.add(p);
      return list;
    } 
    char ch = up.charAt(0);
    ArrayList<String> left = subseq2( p + ch, up.substring(1));
    ArrayList<String> right = subseq2(p,up.substring(1));
    left.addAll(right);

    return left;
  }
}
