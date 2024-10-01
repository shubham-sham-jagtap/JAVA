
// Scope of a variable is the part of the program where the variable is accessible. Like C/C++,
//  in Java, all identifiers are lexically (or statically) scoped, i.e.scope of a variable can be 
//  determined at compile time and independent of function call stack. 
// Java programs are organized in the form of classes. Every class is part of some package.
//  Java scope rules can be covered under following categories.

public class Scope {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        {
            // int a = 70;  -  already initialised outside the block in the same method, hence you cannot initialise again
            // but you can change the value
            a = 100
            int c = 50;
            // values initialised in this block, will remain in the block
         }

        //  System.out.println(c);  - cannot use outside the block
    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
