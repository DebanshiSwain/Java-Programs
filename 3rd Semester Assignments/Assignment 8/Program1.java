/* Question 1 (Threads):
Write a java program that will create the reference of the thread and display the details of the reference thread. (It should display class, name of thread, priority, group name)
*/
class ThreadDetails {
    public static void main(String [] args) {
        Thread t = Thread.currentThread();
        System.out.println("Details of the Thread");
        System.out.println("Class=" + t.getClass());
        System.out.println("Name=" + t.getName());
        System.out.println("Priority=" + t.getPriority());
        System.out.println("Thread Group Name=" + t.getThreadGroup().getName());
    }
}
