/* Question 6 (Threads):
Write a java program to create two threads. First thread should find the square of the number, second thread should find the sum of the digits of the number.
*/
import java.util.*;
class Square extends Thread {
    int n;
    Square(int num) {
        n = num;
    }
    public void run() {
        System.out.println("Square of " + n + " = " + (n * n));
    }
}
class Sum extends Thread {
    int n;
    Sum(int num) {
        n = num;
    }
    public void run() {
        int sum = 0, rem, n2 = n;
        while(n != 0) {
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println("Sum of digits of the number " + n2 + " = " + sum);
    }
}
class Number {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        Square sq = new Square(n);
        sq.start();
        Sum s = new Sum(n);
        s.start();
    }
}
