public class Prgrm2 {
    public static void main(String[] args) {

        
        int jerryBag = 5;
        int tomBag = 3;

        
        System.out.println("Before Swapping:");
        System.out.println("Jerry's bag has " + jerryBag + " apples.");
        System.out.println("Tom's bag has " + tomBag + " apples.");

        
        int temp = jerryBag;
        jerryBag = tomBag;
        tomBag = temp;

        
        System.out.println("\nAfter Swapping:");
        System.out.println("Jerry's bag has " + jerryBag + " apples.");
        System.out.println("Tom's bag has " + tomBag + " apples.");
    }
}
