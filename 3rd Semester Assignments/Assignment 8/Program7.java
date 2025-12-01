/* Question 7 (Threads):
Write a java program that will create two threads. The main thread will read a number and one thread will print the multiplication table of the entered number and at the same time the other thread will find the factorial of the entered number.
*/
import java.util.*;
class Table extends Thread {
    int n;
    Table(int num) {
        n = num;
    }
    public void run() {
        System.out.println("Multiplication Table of " + n + ":");
        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
class Fact extends Thread {
    int n;
    Fact(int num) {
        n = num;
    }
    public void run() {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " = " + fact);
    }
}
class Main2 {
    public static void main(String [] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        Table t = new Table(n);
        Fact f = new Fact(n);
        t.start();
        f.start();
        t.join();
        f.join();
    }
}
