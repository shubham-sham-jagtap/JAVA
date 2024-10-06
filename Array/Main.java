package Array;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //SYNTAX
        // datatype[] variable_name = new datatype[]
        // int[] ros; //decleration of array. ros is getting defined in the stack
        // ros = new int[5]; // initialisation: actually here object is being created in the memory (heap)
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        //input using for loop
        for(int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        
        // for(int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        // for(int num : arr) {
        //     System.out.print(num);
        // }
           
     }
}
