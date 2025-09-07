// 11. Write a program to find out the largest between three numbers using the conditional operator.

import java.util.Scanner;
class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        
        System.out.println(
            (n1 > n2 && n1 > n3) ? (n1 + " is largest") :
            (n2 > n3 ? (n2 + " is largest") : (n3 + " is largest"))
        );
    }
}
