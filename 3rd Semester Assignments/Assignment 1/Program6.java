// 6. Write a program to input the marks of a student in three different subjects and then display the average mark.

import java.util.Scanner;
class P6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks in three subjects: ");
        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        double m3 = sc.nextDouble();
        
        double avg = (m1 + m2 + m3) / 3;
        System.out.println("Average marks: " + avg);
    }
}
