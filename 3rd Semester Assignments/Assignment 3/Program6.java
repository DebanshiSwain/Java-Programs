// 6. Write a program that will take employee id, employee name, department number, salary from the command prompt. Use method display() to display the record of employee.

class P6 {
    public static void main(String[] args) {
        int id = Integer.parseInt(args[0]);
        String name = args[1];
        int dept = Integer.parseInt(args[2]);
        double salary = Double.parseDouble(args[3]);
        
        display(id, name, dept, salary);
    }
    
    static void display(int id, String name, int dept, double salary) {
        System.out.println("Employee Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Dept No: " + dept);
        System.out.println("Salary: " + salary);
    }
}
