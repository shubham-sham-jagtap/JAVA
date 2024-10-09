import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(40);
        
        // System.out.println(list.contains(20));
        // list.set(0, 99);
        // list.remove(3);
        // System.out.print(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //to get an item
        for(int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here
        }
    }
}
