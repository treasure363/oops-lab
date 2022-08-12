//WAJP to find the addition of 2 integer
/*
 * Method 1: Using Arithmetic Operator
 * Method 2: Without Using Arithmetic Operator
 * Method 3: Using Bitwise Operators
 * Method 4: Using Recursion
 */
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int a, b;
        System.out.println("Input Two Integers to Add: ");
        a = ob.nextInt();
        b = ob.nextInt();
        
        method1(a, b);
        method2(a, b);  //Doesn't work for negative numbers
        method3(a, b);
        System.out.print("Sum of " + a + " + " + b + " = ");
        method4(a, b);
        ob.close();
    }

    public static void method1(int a, int b)
    {
        System.out.println("Sum of " + a + " + " + b + " = " + (a + b));
    }

    public static void method2(int a, int b)
    {
        System.out.print("Sum of " + a + " + " + b + " = ");
        for (int i = 1; i <= b; i++)
            a++;
        System.out.println(a);
    }

    public static void method3(int a, int b)
    {
        System.out.print("Sum of " + a + " + " + b + " = ");
        while (b != 0)
        {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        System.out.println(a);
    }

    public static void method4(int a, int b)
    {
        if (b == 0)     System.out.println(a);
        else            method4(a ^ b, (a & b) << 1);
    }

}
