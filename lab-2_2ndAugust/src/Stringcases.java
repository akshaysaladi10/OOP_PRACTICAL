import java.util.Scanner;

public class Stringcases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String input = scanner.nextLine();


        int len = input.length();
        System.out.println("Length of the string: " + len);


        if (len > 2) {
            System.out.println("Character at index 2: " + input.charAt(2));
        } else {
            System.out.println("String too short for charAt(2)");
        }


        String upper = input.toUpperCase();
        System.out.println("Uppercase: " + upper);


        String lower = input.toLowerCase();
        System.out.println("Lowercase: " + lower);


        if (len >= 4) {
            String sub = input.substring(1, 4);
            System.out.println("Substring from index 1 to 4: " + sub);
        } else {
            System.out.println("String too short for substring(1, 4)");
        }


        boolean containsTest = input.contains("test");
        System.out.println("Does the string contain 'test'? " + containsTest);


        String replaced = input.replace('a', '@');
        System.out.println("After replacing 'a' with '@': " + replaced);

        scanner.close();
    }
}
