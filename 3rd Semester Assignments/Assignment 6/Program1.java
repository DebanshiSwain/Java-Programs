/* Question 1:
Create a abstract class Bank that has abstract method getROI(). Create two classes SBI, PNB, BOI inherited from Bank. Create a driver class that prints the rate of interest of each bank using super class memory reference.
*/
import java.util.*;
abstract class Bank {
    abstract double getROI();
}
class SBI extends Bank {
    double roi;
    SBI(double roi) {
        this.roi = roi;
    }
    double getROI() {
        return roi;
    }
}
class PNB extends Bank {
    double roi;
    PNB(double roi) {
        this.roi = roi;
    }
    double getROI() {
        return roi;
    }
}
class BOI extends Bank {
    double roi;
    BOI(double roi) {
        this.roi = roi;
    }
    double getROI() {
        return roi;
    }
}
class BankDriver {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Bank b;
        System.out.println("Enter ROI of SBI:");
        b = new SBI(sc.nextDouble());
        System.out.println("Rate of Interest of SBI=" + b.getROI() + "%");
        System.out.println("Enter ROI of PNB:");
        b = new PNB(sc.nextDouble());
        System.out.println("Rate of Interest of PNB=" + b.getROI() + "%");
        System.out.println("Enter ROI of BOI:");
        b = new BOI(sc.nextDouble());
        System.out.println("Rate of Interest of BOI=" + b.getROI() + "%");
    }
}
