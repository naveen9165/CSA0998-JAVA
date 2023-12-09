import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        if (s.hasNextInt()) {
            int age = s.nextInt();
            if (age >= 18) {
                System.out.println("You are eligible to vote.");
            } else {
                int yearsLeft = 18 - age;
                System.out.println("You are not eligible to vote. You are allowed to vote after " + yearsLeft + " years.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid age.");
        }
    }
}