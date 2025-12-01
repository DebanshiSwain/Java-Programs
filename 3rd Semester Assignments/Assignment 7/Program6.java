/* Question 6 (Exception Handling):
Write a class called Account with the following properties and methods:
Properties: String name, int acc_no, double balance
Methods: void deposit(double amt), void withdraw(double amt), void transfer(Account acc1, Account acc2, double amt)
Assume that an account needs to have a minimum balance of 500. If an attempt is made to withdraw or transfer, which results in balance going below 500, throw a user defined exception called MinimumBalanceException.
*/
import java.util.*;
class MinBal2 extends Exception {
    MinBal2(String s) {
        super(s);
    }
}
class Acc {
    String n;
    int no;
    double b;
    Acc(String n, int no, double b) {
        this.n = n;
        this.no = no;
        this.b = b;
    }
    void deposit(double a) {
        b += a;
    }
    void withdraw(double a) throws MinBal2 {
        if (b - a < 500)
            throw new MinBal2("Low balance! Need min 500.");
        b -= a;
    }
    void transfer(Acc to, double a) throws MinBal2 {
        withdraw(a);
        to.deposit(a);
        System.out.println("Transfer done.");
    }
}
public class Bank2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sender name: ");
        String n1 = sc.nextLine();
        System.out.print("Sender acc no: ");
        int no1 = sc.nextInt();
        System.out.print("Sender balance: ");
        double b1 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Receiver name: ");
        String n2 = sc.nextLine();
        System.out.print("Receiver acc no: ");
        int no2 = sc.nextInt();
        System.out.print("Receiver balance: ");
        double b2 = sc.nextDouble();
        Acc a1 = new Acc(n1, no1, b1);
        Acc a2 = new Acc(n2, no2, b2);
        System.out.print("Enter amount to transfer: ");
        double amt = sc.nextDouble();
        try {
            a1.transfer(a2, amt);
        } catch (MinBal2 e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Sender final bal = " + a1.b);
        System.out.println("Receiver final bal = " + a2.b);
        sc.close();
    }
}
