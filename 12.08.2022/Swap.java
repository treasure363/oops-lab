//WAJP to find swapping of 2 integer
/*
 * Method 1: Using Third Variable
 * Method 2: Without Using Third Variable + With Using Arithmetic Operator
 * Method 3: Without Using Third Variable + Without Using Arithmetic Operator [XOR]
 * Method 4: Without Using XOR in a single line swap
 */
import java.util.Scanner;
public class Swap {
    public static void main(String[] args)throws java.util.InputMismatchException {
        int a, b;
        Scanner ob = new Scanner(System.in);
        System.out.println("Input Two Integers to Swap: ");
        a = ob.nextInt();
        b = ob.nextInt();
        method1(a, b);  //Using Third Variable
        method2(a, b);  //Without Using Third Variable
        method3(a, b);  //XOR
        method4(a, b);  //Single line swap
        ob.close();
    }

    public static void method1(int a, int b) {
        System.out.println("Method 1: Using Third Variable");
        int c;
        System.out.println("Before Swapping\na: " + a + "\tb: " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After Swapping\na: " + a + "\tb: " + b);
    }

    public static void method2(int a, int b) {
        System.out.println("Method 2: Without Using Third Variable + With Using Arithmetic Operator");
        System.out.println("Before Swapping\na: " + a + "\tb: " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping\na: " + a + "\tb: " + b);
    }

    public static void method3(int a, int b) {
        System.out.println("Method 3: Without Using Third Variable + Without Using Arithmetic Operator [XOR]");
        System.out.println("Before Swapping\na: " + a + "\tb: " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swapping\na: " + a + "\tb: " + b);
    }

    public static void method4(int a, int b) {
        System.out.println("Method 4: Without Using XOR in a single line swap");
        System.out.println("Before Swapping\na: " + a + "\tb: " + b);
        a = (a + b) -  (b = a);     //(a ^ b) -  (b = a) also works
        System.out.println("After Swapping\na: " + a + "\tb: " + b);
    }

}
