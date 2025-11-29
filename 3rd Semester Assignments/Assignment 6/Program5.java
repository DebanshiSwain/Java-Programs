/* Question 5:
Create an interface Servicing that has abstract methods getServiceTime(). Create two class Car, Bike that implement interface. Create a driver class that creates the objects of two class and displays the service time.
*/
import java.util.*;
interface Servicing {
    int getServiceTime();
}
class Car implements Servicing {
    int time;
    Car(int time) {
        this.time = time;
    }
    public int getServiceTime() {
        return time;
    }
}
class Bike implements Servicing {
    int time;
    Bike(int time) {
        this.time = time;
    }
    public int getServiceTime() {
        return time;
    }
}
class ServiceDriver {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter service time for Car:");
        Car c = new Car(sc.nextInt());
        System.out.println("Enter service time for Bike:");
        Bike b = new Bike(sc.nextInt());
        Servicing s;
        s = c;
        System.out.println("Car service time=" + s.getServiceTime() + " hours");
        s = b;
        System.out.println("Bike service time=" + s.getServiceTime() + " hours");
    }
}
