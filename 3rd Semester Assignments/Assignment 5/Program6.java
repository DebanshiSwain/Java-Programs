/*6. Create the classes as given in the below figure. Display the interest rate in the following format:
SBI Rate of Interest : 8
ICICI Rate of Interest : 7
AXIS Rate of Interest : 9*/
import java.util.Scanner;
class Bank {
    int rate;
    Bank(int r) {
        rate = r;
    }
    int getRateOfInterest() {
        return rate;
    }
}
class SBI extends Bank {
    SBI(int r) {
        super(r);
    }
}
class ICICI extends Bank {
    ICICI(int r) {
        super(r);
    }
}
class AXIS extends Bank {
    AXIS(int r) {
        super(r);
    }
}
class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter SBI rate of interest: ");
        int sbiRate = sc.nextInt();
        System.out.print("Enter ICICI rate of interest: ");
        int iciciRate = sc.nextInt();
        System.out.print("Enter AXIS rate of interest: ");
        int axisRate = sc.nextInt();
        Bank b;
        b = new SBI(sbiRate);
        System.out.println("SBI Rate of Interest : " + b.getRateOfInterest());
        b = new ICICI(iciciRate);
        System.out.println("ICICI Rate of Interest : " + b.getRateOfInterest());
        b = new AXIS(axisRate);
        System.out.println("AXIS Rate of Interest : " + b.getRateOfInterest());
    }
}
