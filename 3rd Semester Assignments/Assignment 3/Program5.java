// 5. Write a program that will take two integer numbers from the command prompt and find their GCD.

class P5 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        System.out.println("GCD = " + a);
    }
}
