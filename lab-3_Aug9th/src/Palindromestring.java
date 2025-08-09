import java.util.Scanner;

public class Palindromestring {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = sc.nextLine();


        StringBuilder sb = new StringBuilder(input);


        String reversed = sb.reverse().toString();


        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("✅ The string is a palindrome.");
        } else {
            System.out.println("❌ The string is not a palindrome.");
        }

        sc.close();
    }
}
