/*7. Create a class Person that has data member name. Use constructor to initialize name and display() to display name. Create a derived class Employee from Person class having private members empid. Using constructor initialize empid and have method display() to display empid. Create another derived class HourlyEmployee from Employee with private members hourlyRate and hoursWorked. Use constructor to initialize input and methods getGrossPay() that computes and returns the gross pay of the employee and display() to display the hourlyRate, hoursWorked and gross pay. Create a driver class to test the functionalities of the above classes and display output in the specified format.*/
import java.util.Scanner;
class Person {
    String name;
    Person(String n) {
        name = n;
    }
    void display() {
        System.out.println("Name : " + name);
    }
}
class Employee extends Person {
    int empId;
    Employee(String n, int id) {
        super(n);
        empId = id;
    }
    void display() {
        super.display();
        System.out.println("EmpID : " + empId);
    }
}
class HourlyEmployee extends Employee {
    double hourlyRate, hoursWorked;
    HourlyEmployee(String n, int id, double rate, double hours) {
        super(n, id);
        hourlyRate = rate;
        hoursWorked = hours;
    }
    double getGrossPay() {
        return hourlyRate * hoursWorked;
    }
    void display() {
        super.display();
        System.out.println("Hourly Rate : " + hourlyRate);
        System.out.println("Hours Worked : " + hoursWorked);
        System.out.println("Gross Pay : " + getGrossPay());
    }
}
class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();
        System.out.print("Enter hourly rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter hours worked: ");
        double hours = sc.nextDouble();
        HourlyEmployee e = new HourlyEmployee(name, id, rate, hours);
        e.display();
    }
}
