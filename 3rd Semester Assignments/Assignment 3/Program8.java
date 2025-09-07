// 8. Write a program to input a jagged array and display it.

import java.util.Scanner;
class P8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total rows: ");
        int rows = input.nextInt();
        int[][] jagged = new int[rows][];
        
        System.out.print("Enter number of columns for each row: ");
        for (int r = 0; r < rows; r++) {
            int cols = input.nextInt();
            jagged[r] = new int[cols];
        }
        
        System.out.println("Enter elements:");
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < jagged[r].length; c++) {
                jagged[r][c] = input.nextInt();
            }
        }
        
        System.out.println("Jagged array elements are:");
        for (int[] row : jagged) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
