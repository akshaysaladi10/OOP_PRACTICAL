import java.util.Scanner;

public class Prgrm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the base bill amount (₹): ");
        double baseAmount = sc.nextDouble();

        
        final double GST_RATE = 0.18;         
        final double MAINTENANCE_RATE = 0.05; 
        double discountRate;

   
        if (baseAmount > 1000) {
            discountRate = 0.10; 
        } else {
            discountRate = 0.05; 
        }

       
        double gstAmount = baseAmount * GST_RATE;
        double maintenanceAmount = baseAmount * MAINTENANCE_RATE;
        double discountAmount = baseAmount * discountRate;
        
        
        double totalBill = baseAmount + gstAmount + maintenanceAmount - discountAmount;

        
        System.out.println("\n----- BILL DETAILS -----");
        System.out.printf("Base Amount        : ₹%.2f\n", baseAmount);
        System.out.printf("GST (18%%)          : ₹%.2f\n", gstAmount);
        System.out.printf("Maintenance (5%%)   : ₹%.2f\n", maintenanceAmount);
        System.out.printf("Discount (%.0f%%)     : -₹%.2f\n", discountRate * 100, discountAmount);
        System.out.println("----------------------------");
        System.out.printf("Total Bill Amount  : ₹%.2f\n", totalBill);

        sc.close();
    }
}


        