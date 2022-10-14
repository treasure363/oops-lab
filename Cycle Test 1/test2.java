//WAP to read a number using Scanner class and check if it is Prime or not.

import java.util.Scanner;

class test2 {
    public static boolean check_prime(int n) {
        if(n < 2)   return false;
        for(int i = 2; i * i <= n; ++i)
            if(n % i == 0)  return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        System.out.println(check_prime(sc.nextInt())?"Prime":"Not Prime");
        sc.close();
    }
}

/* Output
PS D:\Projects\oops-lab\Cycle Test 1> javac test2.java
PS D:\Projects\oops-lab\Cycle Test 1> java test2
Enter value
100000007
Prime
PS D:\Projects\oops-lab\Cycle Test 1> java test2
Enter value
2
Prime
PS D:\Projects\oops-lab\Cycle Test 1> java test2
Enter value
1
Not Prime
PS D:\Projects\oops-lab\Cycle Test 1> java test2
Enter value
22
Not Prime
PS D:\Projects\oops-lab\Cycle Test 1> 
 */