// 2. Write a program to enter the marks of a student in 4 different subjects. Then display the grade of the student as per the following conditions:
// a. If the average mark is greater than or equal to 90 then grade is O
// b. If the average mark is greater than equal to 80 but less than 90 then grade is E
// c. If the average mark is greater than equal to 70 but less than 80 then grade is A
// d. If the average mark is greater than equal to 60 but less than 70 then grade is B
// e. If the average mark is greater than equal to 50 but less than 60 then grade is C
// f. If the average mark is less than 50 then grade is F

import java.util.Scanner;
class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in 4 subjects: ");
        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        double m3 = sc.nextDouble();
        double m4 = sc.nextDouble();
        
        double avg = (m1 + m2 + m3 + m4) / 4;
        String grade;
        
        if (avg >= 90) {
            grade = "O";
        } else if (avg >= 80) {
            grade = "E";
        } else if (avg >= 70) {
            grade = "A";
        } else if (avg >= 60) {
            grade = "B";
        } else if (avg >= 50) {
            grade = "C";
        } else {
            grade = "F";
        }
        
        System.out.println("Your grade is " + grade);
    }
}
