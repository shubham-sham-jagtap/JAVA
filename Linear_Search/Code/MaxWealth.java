package Linear_Search.Code;
// its a leet code question 
public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
            {1, 2, 3},
            {3, 4, 1},
            {4, 1}
        };
        int ans = MaximumWealth(accounts);
        System.out.println(ans);

    }

    static int MaximumWealth(int[][] arr) {
        int maxwealth = Integer.MIN_VALUE; //8
        for(int person = 0; person < arr.length; person++) {
            int sum = 0;
            for(int account = 0; account < arr[person].length; account++) {
                sum += arr[person][account];
            }
            
            if(sum > maxwealth) {
                maxwealth = sum;
            }
        }
        return maxwealth;

    }
}
