/* Question 2 (Threads):
Write a java program that will create a thread and set the thread name, display the thread name, get the thread id, check if the thread is currently alive or not.
*/
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}
class ThreadInfo {
    public static void main(String [] args) {
        MyThread t = new MyThread();
        t.setName("Demo Thread");
        System.out.println("Name=" + t.getName());
        System.out.println("Thread ID=" + t.getId());
        System.out.println("Is Thread Alive? " + t.isAlive());
        t.start();
        System.out.println("Is Thread Alive? " + t.isAlive());
    }
}
