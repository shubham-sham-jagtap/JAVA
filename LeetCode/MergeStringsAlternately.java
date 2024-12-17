// You are given two strings word1 and word2. Merge the strings
// by adding letters in alternating order, starting with word1. If a 
// string is longer than the other, append the additional letters onto the end of the merged string.
// Return the merged string.

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String w1 = "abc";
        String w2 = "pqrst";
        String ans = mergeAlternately(w1, w2);
        System.out.println(ans);
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if(i < word1.length()) {
                sb.append(word1.charAt(i));
            }
            if(i < word2.length()) {
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}
