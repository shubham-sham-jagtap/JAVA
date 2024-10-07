package Array;

public class MultiDimension {
    public static void main( String[] args) {
        /*
            * 1 2 3
            * 4 5 6
            * 7 8 9
         */

        //  int[][] arr = new int[3][3]; //there is no compulsion to specify the number of columns

         int[][] arr = {
            {1, 2, 3}, // 0th index
            {4, 5, 9}, // 1st index
            {6, 7, 8} // 2nd index -> arr[2] = {6, 7, 8, 9}
         };

        System.out.println(arr.length); //no of rows
         // input

        //  for(i = 0; i < arr.length; i++) {

        //  }
    }
}
