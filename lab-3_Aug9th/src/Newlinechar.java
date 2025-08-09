import java.util.Scanner;

public class Newlinechar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String name = sc.nextLine();


        System.out.println("\nYour name in separate lines:");
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        sc.close();
    }
}
