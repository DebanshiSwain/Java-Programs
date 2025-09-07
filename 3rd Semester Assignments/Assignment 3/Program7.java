// 7. Write a program to accept the SIC, name, branch and marks of six subjects using command-line arguments. Calculate the average marks.

class P7 {
    public static void main(String[] args) {
        String sic = args[0];
        String name = args[1];
        String branch = args[2];
        int sum = 0;
        
        for (int i = 3; i < 9; i++) {
            sum += Integer.parseInt(args[i]);
        }
        
        double avg = sum / 6.0;
        
        System.out.println("SIC: " + sic);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Average: " + avg);
    }
}
