public class SplitArray {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(arr, k));
    }
    public static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for(int num : nums) {
            start = Math.max(start, num);
            end += num; 
        }

        while (start < end) {
            //mid is going to be the potential answer
            int mid = start + (end - start)/2;

            //min piece that can be done is 1
            int piece = 1;
            int sum = 0;

            for(int num : nums) {
                //checkpoint: check whether the sum exceeds mid
                //if yes: take another the piece (i.e, increase the count of piece)
                //if No: add num to sum
                if(sum + num > mid) {
                    sum = num;
                    piece++;
                }else {
                    sum += num;
                }
            }
            // if piece is greater than k that means it lies to the right side that means greater side
            if(piece > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
            
        }

        return start;
    }
}
