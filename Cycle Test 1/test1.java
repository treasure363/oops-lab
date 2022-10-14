//WAP to define a class "STUDENT" having members name, roll_no and marks in 5 subjects.
//Display the average marks of each student along with name and roll_number.
//Initialize each student's information using Constructor
import java.util.Scanner;

class STUDENT {
    String name;
    int roll_no;
    int marks[];
    STUDENT(String name, int roll_no, int[] marks) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
    }
    public double average() {
        int sum = 0;
        for(int i = 0; i < this.marks.length; ++i)
            sum += this.marks[i];
        return sum / marks.length;
    }
}

class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Students");
        int n = sc.nextInt();
        STUDENT[] s = new STUDENT[n];
        String name;
        int roll_no;
        for(int i = 0; i < n; ++i) {
            int marks[] = new int[5];
            System.out.println("Enter the details for Student " + (i+1));
            name = sc.next() + sc.nextLine();
            roll_no = sc.nextInt();
            for(int j = 0; j < 5; j++)
                marks[j] = sc.nextInt();
            s[i] = new STUDENT(name, roll_no, marks);
        }
        for(int i = 0; i < n; ++i) {
            System.out.println("Name: " + s[i].name);
            System.out.println("Roll No: " + s[i].roll_no);
            System.out.println("Average: " + s[i].average());
        }
        sc.close();
    }
}

/* Output:
PS D:\Projects\oops-lab\Cycle Test 1> java test1
Enter number of Students
3                 
Enter the details for Student 1
Ankit Choudhury
35
10 20 30 40 50
Enter the details for Student 2
Shashwat Tripathy
20
20 20 20 20 20
Enter the details for Student 3
Arijeet Mishra
8
11 22 33 44 55    
Name: Ankit Choudhury
Roll No: 35
Average: 30.0
Name: Shashwat Tripathy
Roll No: 20
Average: 20.0
Name: Arijeet Mishra
Roll No: 8
Average: 33.0
PS D:\Projects\oops-lab\Cycle Test 1> 
*/