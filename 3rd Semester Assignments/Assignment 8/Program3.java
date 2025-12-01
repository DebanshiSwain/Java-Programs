/* Question 3 (Threads using Runnable):
Write a java program that will create one thread [using Runnable interface]. The main thread will read a number and the newly created thread checks the number is Armstrong number or not.
*/
import java.util.Scanner;
class Number implements Runnable {
    int num;
    Number(int n) {
        num = n;
    }
    public void run() {
        int sum = 0, n2 = num;
        while(num > 0) {
            int rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }
        if(sum == n2)
            System.out.println(n2 + " is an Armstrong number = " + sum);
        else
            System.out.println(n2 + " is not an Armstrong number");
    }
}
class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        Thread t = new Thread(new Number(n));
        t.start();
    }
}
