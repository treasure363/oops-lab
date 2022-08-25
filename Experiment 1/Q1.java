//Greater of two integers 
import java.util.Scanner;

class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter two integers");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Greatest Number: " + ((a>b)?a:b));
        sc.close();
    }
}

// class Restriction{
//     //Greater of two integers without using Relational Operators
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a, b, d;
//         System.out.println("Enter two numbers");
//         a = sc.nextInt();
//         b = sc.nextInt();
//         try {
//             d = a / b;  //Interger Division
//             d = 10 / d; //Might throw Exception divide by zero
//             System.out.println(a);
//         } catch (Exception e) {
//             sc.close();
//             System.out.println(b);
//         }
        
//         sc.close();
//     }
// }
