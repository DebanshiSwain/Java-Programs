// 4. Write a program to swap two numbers without using a third variable

import java.util.Scanner;
class P4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }
}
