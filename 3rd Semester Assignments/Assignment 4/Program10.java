/*10. Design a class ‘Time’ having data members as hour, minute and second. The class should have a parameterized constructor to initialize its data members. It should also have methods displayTime() to display the time in HH:MM:SS format and addTime() to add two times. Test these methods by creating a main method in another class.*/
import java.util.Scanner;
class Time {
    int hour, minute, second;
    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    void displayTime() {
        System.out.println(String.format("%02d:%02d:%02d", hour, minute, second));
    }
    Time addTime(Time t) {
        int s = second + t.second;
        int m = minute + t.minute + s / 60;
        int h = hour + t.hour + m / 60;
        return new Time(h % 24, m % 60, s % 60);
    }
}
class TimeDriver {
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first time (hour minute second):");
        Time t1 = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("Enter second time (hour minute second):");
        Time t2 = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.print("First time:");
        t1.displayTime();
        System.out.print("Second time:");
        t2.displayTime();
        Time t3 = t1.addTime(t2);
        System.out.print("Sum of time:");
        t3.displayTime();
    }
}
