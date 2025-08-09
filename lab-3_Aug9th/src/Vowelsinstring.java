import java.util.Scanner;

public class Vowelsinstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take string input from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert to lowercase for easy comparison
        input = input.toLowerCase();

        int vowelCount = 0;

        // Check each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        // Display result
        System.out.println("Number of vowels in the given string: " + vowelCount);

        sc.close();
    }
}
