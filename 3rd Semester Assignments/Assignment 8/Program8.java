/* Question 8 (Threads):
Write a java program that will create two threads. Set the priority to each thread and display it.
*/
class Priority {
    static class A extends Thread {
        public void run() {
            System.out.println("Thread A Priority: " + getPriority());
        }
    }
    static class B extends Thread {
        public void run() {
            System.out.println("Thread B Priority: " + getPriority());
        }
    }
    public static void main(String[] args) {
        A t1 = new A();
        B t2 = new B();
        t1.setPriority(3);
        t2.setPriority(8);
        t1.start();
        t2.start();
    }
}
