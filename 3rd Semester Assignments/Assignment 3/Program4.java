// 4. Write a program that performs the addition of two numbers using command-line arguments.

class P4 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers as command-line arguments.");
            return;
        }
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a + b;
        
        System.out.println("Sum = " + sum);
    }
}
