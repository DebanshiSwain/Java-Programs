/* Question 4:
Write a program to implement multiple inheritance using interface.
*/
interface Reader {
    void read();
}
interface Writer {
    void write();
}
class Word implements Reader, Writer {
    public void read() {
        System.out.println("Reading data");
    }
    public void write() {
        System.out.println("Writing data");
    }
}
class MIriver {
    public static void main(String args[]) {
        Word d = new Word();
        d.read();
        d.write();
    }
}
