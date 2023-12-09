. import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();
        
        if (days >= 0) {
            int years = days / 365;
            int remainingDays = days % 365;
            int weeks = remainingDays / 7;
            int remainingDaysInWeeks = remainingDays % 7;
            
            System.out.println("No. of years: " + years);
            System.out.println("No. of weeks: " + weeks);
            System.out.println("No. of days: " + remainingDaysInWeeks);
        } else {
            System.out.println("Invalid input. Please enter a non-negative number of days.");
        }
    }
}