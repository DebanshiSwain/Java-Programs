/* Question 4 (Threads using extends):
Write a java program that will create one thread [using extends]. The main thread will read a number and check the number is prime or composite and at the same time the new thread will check the number is palindrome or not.
*/
import java.util.Scanner;
class Mythread extends Thread {
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while(num > 0) {
            int rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }
        if(sum == temp) {
            System.out.println("It is Palindrome Number");
        } else {
            System.out.println("It is not a Palindrome Number");
        }
    }
}
class Palindrome {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        t1.start();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 2; i <= n; i++) {
            if(n % i == 0) {
                count++;
            }
        }
        if(count == 1) {
            System.out.println("It is Prime number");
        } else {
            System.out.println("It is a Composite number");
        }
    }
}
