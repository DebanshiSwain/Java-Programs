/* 1.Write a program to display your name, branch, roll no, and college name on the computer screen.*/
import java.util.Scanner;
class P1
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(system.in);
    System.out.println(“Enter your name”);
    String name=sc.nextLine();
    System.out.println(“Enter your branch”);
    String branch=sc.nextLine();
    System.out.println(“Enter your roll no”);
    int roll=sc.nextInt();
    System.out.println(“Enter your college”);
    String college=sc.nextLine();
    System.out.println(“Name: ”+name);
    System.out.println(“Roll: ”+roll);
    System.out.println(“Branch: ”+branch);
    System.out.println(“College: "+college);
  }
}
