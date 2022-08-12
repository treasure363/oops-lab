//WAJP to check whether a number is Even or Odd
/*
 * Method 1: Using % Operator
 * Method 2: Using / Operator
 * Method 3: Using Ternary Operator in a single line
 * Method 4: Using Bitwise AND Operator &
 * Method 5: Using Bitwise OR Operator |
 * Method 6: Using Bitwise XOR Operator ^
 * Method 7: Using Bitwise Shift Operator << and >>
 * Method 8: Without Using any conditional statements [Array]
 */
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args)throws java.util.InputMismatchException {
        int n;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        n = ob.nextInt();
        method1(n);     //Using % Operator
        method2(n);     //Using / Operator
        method3(n);     //Using Ternary Operator in a single line
        method4(n);     //Using Bitwise AND Operator &
        method5(n);     //Using Bitwise OR Operator |
        method6(n);     //Using Bitwise XOR Operator ^
        method7(n);     //Using Bitwise Shift Operator << and >>
        method8(n);     //Without Using any conditional statements [Array]
        ob.close();
    }

    public static void method1(int n) {
        //Method 1: Using % Operator
        System.out.println("Method 1: Using % Operator");
        if(n % 2 == 0)  System.out.println(n + " is an Even Number.");
        else            System.out.println(n + " is a Odd Number.");
    }

    public static void method2(int n) {
        //Method 2: Using / Operator
        System.out.println("Method 2: Using / Operator");
        if((n / 2) * 2 == n)    System.out.println(n + " is an Even Number.");
        else                    System.out.println(n + " is a Odd Number.");
    }

    public static void method3(int n) {
        //Method 3: Using Ternary Operator
        System.out.println("Method 3: Using Ternary Operator");
        System.out.println((n % 2 == 0) ? n + " is a Even Number.": n + " is an Odd Number.");
    }

    public static void method4(int n) {
        //Method 4: Using Bitwise AND Operator &
        System.out.println("Method 4: Using Bitwise AND Operator &");
        if(!((n & 1) == 1))     System.out.println(n + " is an Even Number.");
        else                    System.out.println(n + " is a Odd Number.");
    }

    public static void method5(int n) {
        //Method 5: Using Bitwise OR Operator |
        System.out.println("Method 5: Using Bitwise OR Operator |");
        if((n | 1) > n)    System.out.println(n + " is an Even Number.");
        else               System.out.println(n + " is a Odd Number.");
    }

    public static void method6(int n) {
        //Method 6: Using Bitwise XOR Operator ^
        System.out.println("Method 6: Using Bitwise XOR Operator ^");
        if((n ^ 1) == n + 1)    System.out.println(n + " is an Even Number.");
        else                    System.out.println(n + " is a Odd Number.");
    }

    public static void method7(int n) {
        //Method 7: Using Bitwise Shift Operator
        System.out.println("Method 7: Using Bitwise Shift Operator << and >>");
        int temp = n;
        n >>= 1;
        n <<= 1;
        if(n == temp)   System.out.println(temp + " is an Even Number.");
        else            System.out.println(temp + " is an Odd Number.");
    }

    public static void method8(int n) {
        //Method 8: Without Using any conditional statements [Array]
        System.out.println("Method 8: Without Using any conditional statements [Array]");
        String[] arr = {n + " is an Even Number.", n + " is a Odd Number."};
        if(n<0)     System.out.println(arr[-n % 2]);
        else        System.out.println(arr[n % 2]);
    }

}
