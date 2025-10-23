/*5. Write a program to declare a class Employee with data members empid, ename, dept, sal. Add a method getData(), putData() to accept and display the details of n employees. Define a driver class to create the objects of Employee class and perform basic operations.*/
import java.util.Scanner;
class Employee {
    int empid;
    String ename;
    String dept;
    double sal;
    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee id:");
        empid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter employee name:");
        ename = sc.nextLine();
        System.out.println("Enter department:");
        dept = sc.nextLine();
        System.out.println("Enter salary:");
        sal = sc.nextDouble();
    }
    void putData() {
        System.out.println("Employee id: " + empid);
        System.out.println("Name: " + ename);
        System.out.println("Department: " + dept);
        System.out.println("Salary: " + sal);
    }
}
class EmployeeDriver {
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees:");
        int n = sc.nextInt();
        Employee e[] = new Employee[n];
        for (int i = 0; i < n; i++) {
            e[i] = new Employee();
            e[i].getData();
        }
        for (int i = 0; i < n; i++) {
            e[i].putData();
        }
    }
}
