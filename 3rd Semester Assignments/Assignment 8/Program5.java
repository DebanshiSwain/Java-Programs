/* Question 5 (Threads):
Write a java program that will create one child thread. The child thread has to display all odd numbers between m and n, and the main thread will display all the even numbers between m and n.
*/
import java.util.*;
class Odd extends Thread {
    int m, n;
    Odd(int m, int n) {
        this.m = m;
        this.n = n;
    }
    public void run() {
        System.out.println("Odd Numbers:");
        for(int i = m; i <= n; i++) {
            if(i % 2 != 0)
                System.out.println(i + " ");
        }
        System.out.println();
    }
}
class EvenOdd {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number range");
        int m = sc.nextInt();
        int n = sc.nextInt();
        Odd o = new Odd(m, n);
        o.start();
        System.out.println("Even Numbers:");
        for(int i = m; i <= n; i++) {
            if(i % 2 == 0)
                System.out.println(i + " ");
        }
        System.out.println();
    }
}
