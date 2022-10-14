//WAP to read 'n' numbers and print the second smallest number

import java.util.Scanner;

class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, smallest = Integer.MAX_VALUE, second_smallest = -1, temp;
        System.out.println("Enter value of n");
        n = sc.nextInt();
        for(int i = 0; i < n; ++i) {
            temp = sc.nextInt();
            if(temp < smallest) {
                second_smallest = smallest;
                smallest = temp;
            }
        }
        System.out.println("Second Smallest: " + second_smallest);
        sc.close();
    }
}
/* Output
PS D:\Projects\oops-lab\Cycle Test 1> java test4
Enter value of n
5
88 69 34 52 25
Second Smallest: 34
PS D:\Projects\oops-lab\Cycle Test 1> 
*/