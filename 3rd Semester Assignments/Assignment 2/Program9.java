// 9. Write a program to display all Armstrong numbers from 1 to 10000.

class P9 {
    public static void main(String[] args) {
        System.out.println("The Armstrong numbers between 1 and 10000 are:");
        
        for (int n = 1; n <= 10000; n++) {
            int pow = (int) Math.log10(n) + 1;
            int temp = n, arm = 0;
            
            while (temp > 0) {
                int d = temp % 10;
                arm += Math.pow(d, pow);
                temp /= 10;
            }
            
            if (arm == n) {
                System.out.print(n + " ");
            }
        }
    }
}
