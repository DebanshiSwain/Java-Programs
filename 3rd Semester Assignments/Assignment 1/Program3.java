// 3. Write a program to input two floating point numbers through  the keyboard and display their sum.

import java.util.Scanner;
class P3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two floating point numbers: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double sum = x + y;
        System.out.println("Sum=" + sum);
    }
}
