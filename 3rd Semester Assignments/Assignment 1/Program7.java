// 7. Write a program to input the time value in seconds and then display it in the hour: minute: second format using the modulus operator (%).
// For example, INPUT: Enter the time in second: 3610
// OUTPUT: 1 Hour: 0 minute: 10 seconds


import java.util.Scanner;
class P7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time: ");
        int sec = sc.nextInt();
        
        int hours = sec / 3600;
        sec = sec % 3600;
        int min = sec / 60;
        sec = sec % 60;
        
        System.out.println(hours + " Hour: " + min + " minute: " + sec + " seconds");
    }
}
