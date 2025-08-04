import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Dateclass {
    public static void main(String[] args) {
       
        LocalDateTime now = LocalDateTime.now();

        
        System.out.println("Current date and time: " + now);

        
        DateTimeFormatter isoFormat = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println("ISO Format: " + now.format(isoFormat));

        
        DateTimeFormatter customFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Custom Format: " + now.format(customFormat));

        
        System.out.println("Year: " + now.getYear());
        System.out.println("Month: " + now.getMonth());         
        System.out.println("Month Value: " + now.getMonthValue()); 
        System.out.println("Day of Month: " + now.getDayOfMonth());
        System.out.println("Hour: " + now.getHour());
        System.out.println("Minute: " + now.getMinute());
        System.out.println("Second: " + now.getSecond());
    }
}
