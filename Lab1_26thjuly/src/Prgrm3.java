import java.util.Scanner;

public class Prgrm3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();

        
        System.out.println("\nSquare roots of numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            double sqrt = Math.sqrt(i);
            System.out.printf("√%d = %.4f\n", i, sqrt);
        }

        sc.close();
    }
}
