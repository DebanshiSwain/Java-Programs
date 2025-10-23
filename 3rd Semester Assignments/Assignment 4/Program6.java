/*6. Define a class Student having the attribute regNo, stdName, branch and CGPA. Write 2 methods to accept and display the student details. Read the details of 50 students using an array of Student class object. Display the student details who has secured the highest CGPA.*/
import java.util.Scanner;
class Student1 {
    String regNo, stdName, branch;
    double CGPA;
    void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter registration number:");
        regNo = sc.nextLine();
        System.out.println("Enter student name:");
        stdName = sc.nextLine();
        System.out.println("Enter branch:");
        branch = sc.nextLine();
        System.out.println("Enter CGPA:");
        CGPA = sc.nextDouble();
    }
    void displayDetails() {
        System.out.println("Reg No: " + regNo);
        System.out.println("Name: " + stdName);
        System.out.println("Branch: " + branch);
        System.out.println("CGPA: " + CGPA);
    }
}
class Student1Driver {
    public static void main(String[] s) {
        Student1 st[] = new Student1[50];
        for (int i = 0; i < 50; i++) {
            st[i] = new Student1();
            st[i].inputDetails();
        }
        int idx = 0;
        double max = st[0].CGPA;
        for (int i = 1; i < 50; i++) {
            if (st[i].CGPA > max) {
                max = st[i].CGPA;
                idx = i;
            }
        }
        System.out.println("Student with highest CGPA:");
        st[idx].displayDetails();
    }
}
