/* Question 6 - Part 1 (Student Class in package btech):
Create a Package btech which has one class Student. Accept student detail through parameterized constructor of Student class. Write a method display() to display the student details.
*/
package btech;
public class Student {
    int roll;
    String name;
    int m1,m2,m3;
    public Student(int roll,String name,int m1,int m2,int m3) {
        this.roll = roll;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    public void display() {
        System.out.println("Roll no:" + roll);
        System.out.println("Name:" + name);
        System.out.println("Sub1:" + m1);
        System.out.println("Sub2:" + m2);
        System.out.println("Sub3:" + m3);
    }
}
/* Question 6 - Part 2 (Driver Class):
Create another class Test containing the main method which will use the package btech and calculate total marks and percentage of marks.
*/
import java.util.*;
import btech.Student;
class TestStudent {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll no:");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name:");
        String name = sc.nextLine();
        System.out.println("Enter marks of 3 subjects:");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        Student s = new Student(roll, name, m1, m2, m3);
        s.display();
        int total = m1 + m2 + m3;
        double percentage = total / 3.0;
        System.out.println("Total=" + total);
        System.out.println("Percentage=" + percentage);
    }
}
