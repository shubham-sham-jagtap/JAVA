package LeetCode;
//https://leetcode.com/problems/koko-eating-bananas/description/
public class Koko {
  public static void main(String[] args) {
    int[] piles = {30,11,23,4,20};
    int h = 8;
    System.out.println(minEatingSpeed(piles, h));
  }
  public static int minEatingSpeed(int[] piles, int h) {
    // find start and end
        int start = 1;
        int end = Integer.MIN_VALUE;
        for(int pile : piles) {
          end = Math.max(end, pile);
        }
        while(start <= end) {
          int mid = start + (end - start) /2;
          int count = 0;
          for(int i = 0; i < piles.length; i++) {
            count += Math.ceil((double)piles[i] / (double)(mid));
          }
          if(count <= h) {
            end = mid - 1;
          } else {
            start = mid + 1;
          } 
        }
        return start;
  }
}
