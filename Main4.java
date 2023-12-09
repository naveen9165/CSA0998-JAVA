import java.util.Scanner;

public class Main4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();
        
        System.out.print("Is the customer a senior citizen? (y/n): ");
        char isSeniorCitizen = scanner.next().charAt(0);
        
        double rateOfInterest;
        
        if (isSeniorCitizen == 'y' || isSeniorCitizen == 'Y') {
            rateOfInterest = 0.12; // 12% interest for senior citizens
        } else {
            rateOfInterest = 0.10; // 10% interest for others
        }
        
        if (principal >= 0 && years >= 0) {
            double interest = principal * rateOfInterest * years;
            System.out.println("Interest: " + interest);
        } else {
            System.out.println("Invalid input. Please enter valid principal and number of years.");
        }
    }
}