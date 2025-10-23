/*1. Write a program that creates a class Account that has members customer name, account number. Account has constructor to initialize its members and method display() to show the result. Create a child class Savings_Account that is derived from Account class. Savings_Account has members min_bal and saving_bal. Use show() to display its details. Then create another child class Account_details from Savings_Account class with members deposit, withdraw and a method show1() to show its details. Child classes have constructors of their own. Create a driver class that creates a record of customer and display all its details.*/
import java.util.Scanner;
class Account {
    String name;
    int accno;
    Account(String n, int a) {
        name = n;
        accno = a;
    }
    void display() {
        System.out.println("Customer Name: " + name);
        System.out.println("Account No: " + accno);
    }
}
class Savings_Account extends Account {
    double min_bal, sav_bal;
    Savings_Account(String n, int a, double m, double s) {
        super(n, a);
        min_bal = m;
        sav_bal = s;
    }
    void show() {
        display();
        System.out.println("Minimum Balance: " + min_bal);
        System.out.println("Savings Balance: " + sav_bal);
    }
}
class Account_details extends Savings_Account {
    double dep, wdraw, fb;
    Account_details(String n, int a, double m, double s, double d, double w) {
        super(n, a, m, s);
        dep = d;
        wdraw = w;
    }
    void show1() {
        show();
        fb = sav_bal + dep - wdraw;
        System.out.println("Deposited amount: " + dep);
        System.out.println("Withdrawal amount: " + wdraw);
        System.out.println("Final Amount: " + fb);
    }
}
class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, accno, min balance, savings, deposited amt, withdrawal amt");
        String na = sc.nextLine();
        int an = sc.nextInt();
        double min = sc.nextDouble();
        double sav = sc.nextDouble();
        double depo = sc.nextDouble();
        double with = sc.nextDouble();
        Account_details obj = new Account_details(na, an, min, sav, depo, with);
        obj.show1();
    }
}
