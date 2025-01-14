public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'a', 'b'};
        char a = 'c';
        char ans = nextGreatestLetter(arr, a);
        System.out.println(ans);
    }
    public static char nextGreatestLetter(char[] letter, char target) {
        int start = 0;
        int end = letter.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(target < letter[mid]) {
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return letter[start % letter.length];
    }
}
