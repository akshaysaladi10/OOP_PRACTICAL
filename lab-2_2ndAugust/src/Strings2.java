import java.util.Scanner;

public class Strings2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();


        boolean isEqualUsingEquals = str1.equals(str2);
        System.out.println("\nUsing equals(): " + isEqualUsingEquals);


        boolean isEqualUsingDoubleEquals = (str1 == str2);
        System.out.println("Using == : " + isEqualUsingDoubleEquals);


        System.out.println("\nstr1 hashCode: " + System.identityHashCode(str1));
        System.out.println("str2 hashCode: " + System.identityHashCode(str2));

        scanner.close();
    }
}
