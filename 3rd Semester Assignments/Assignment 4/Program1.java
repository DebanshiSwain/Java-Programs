/*1. Write a program to print the average of three numbers entered by
user by creating a class named 'Average' having a method to calculate
and print the average. Define another driver class to demonstrate the
basic operation.*/

import java.util.Scanner;
class Average {
double calculateAverage(double a,double b,double c) {
return (a+b+c)/3;
}
}
class AverageDriver {
public static void main(String []s) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter three numbers:");
double n1=sc.nextDouble();
double n2=sc.nextDouble();
double n3=sc.nextDouble();
Average avg=new Average();
System.out.println("Average:"+avg.calculateAverage(n1,n2,n3));
}
}
