/*2. Write a program to create a class named 'Student' with members 'name', 'roll_no', and 'branch'. Declare two methods to input the student details and display the details of the student. Create a driver class to test the functionalities of the above class.*/
import java.util.Scanner;
class Student {
    String name;
    int roll_no;
    String branch;
    void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter roll number:");
        roll_no = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter branch:");
        branch = sc.nextLine();
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Branch: " + branch);
    }
}
class StudentDriver {
    public static void main(String[] args) {
        Student st = new Student();
        st.inputDetails();
        st.displayDetails();
    }
}
