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
        // int[] arr = new int[5];
        //input using for loop
        // for(int i = 0; i < arr.length; i++) {
        //     arr[i] = in.nextInt();
        // }

        // System.out.println(Arrays.toString(arr));
        
        // for(int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        // for(int num : arr) { //for every element in array, print the element
        //     System.out.print(num + " "); // here num represents elements of array
        // }

        // System.out.println(arr[5]); // insex out of bound error

        // String of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
           
     }
}
