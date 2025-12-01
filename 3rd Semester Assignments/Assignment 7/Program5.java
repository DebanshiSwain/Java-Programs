/* Question 5 (Exception Handling):
Write a class called Account with the following properties and methods:
Properties: String name, int acc_no, double balance
Methods: void deposit(double amt), void withdraw(double amt)
Assume that an account needs to have a minimum balance of 500. If an attempt is made to withdraw which results in balance going below 500, throw a user defined exception called MinimumBalanceException. Use throw and throws wherever necessary.
*/
import java.util.*;
class MinBal extends Exception {
    MinBal(String s) {
        super(s);
    }
}
class Account {
    String name;
    int no;
    double bal;
    Account(String n, int a, double b) {
        name = n;
        no = a;
        bal = b;
    }
    void deposit(double amt) {
        bal += amt;
        System.out.println("Balance = " + bal);
    }
    void withdraw(double amt) throws MinBal {
        if (bal - amt < 500)
            throw new MinBal("Low balance! Need min 500.");
        bal -= amt;
        System.out.println("Balance = " + bal);
    }
}
public class Bank1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String n = sc.nextLine();
        System.out.print("Acc no: ");
        int no = sc.nextInt();
        System.out.print("Balance: ");
        double bal = sc.nextDouble();
        Account a = new Account(n, no, bal);
        System.out.print("Enter amount to withdraw: ");
        double amt = sc.nextDouble();
        try {
            a.withdraw(amt);
        } catch (MinBal e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
