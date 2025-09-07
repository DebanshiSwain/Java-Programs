// 1. Write a program to calculate tax, given the following conditions:
// a. If income is less than 150000 then no tax
// b. If taxable income is in the range 150001 to 300000 then charge 10% tax
// c. If taxable income is in the range 300001 to 500000 then charge 20% tax
// d. If taxable income is above 500001 then charge 30% tax

import java.util.Scanner;
class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income: ");
        double inc = sc.nextDouble();
        double tax;
        
        if (inc > 500000) {
            tax = inc * 0.3;
        } else if (inc > 300000) {
            tax = inc * 0.2;
        } else if (inc > 150000) {
            tax = inc * 0.1;
        } else {
            tax = 0;
        }
        
        System.out.println("Tax= " + tax);
    }
}
