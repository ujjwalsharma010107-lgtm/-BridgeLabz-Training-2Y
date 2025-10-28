import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first date (YYYY-MM-DD): ");
            LocalDate date1 = LocalDate.parse(scanner.nextLine());
            System.out.print("Enter second date (YYYY-MM-DD): ");
            LocalDate date2 = LocalDate.parse(scanner.nextLine());
            
            if (date1.isBefore(date2)) {
                System.out.println("The first date is before the second date.");
            } else if (date1.isAfter(date2)) {
                System.out.println("The first date is after the second date.");
            } else if (date1.isEqual(date2)) {
                System.out.println("Both dates are the same.");
            }
        }
    }
}