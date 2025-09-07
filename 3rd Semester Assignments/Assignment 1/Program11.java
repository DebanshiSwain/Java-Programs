// 11. Write a program to check whether an inputted number is  positive or negative.

import java.util.Scanner;
class P11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        if (n < 0)
        {
            System.out.println(n + " is a negative number");
        }
        else
        {
            System.out.println(n + " is a positive number");
        }
    }
}
