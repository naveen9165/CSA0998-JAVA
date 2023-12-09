import java.util.Scanner;

class Student {
    int marksPython, marksC, marksMath, marksPhysics;

    void inputMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks in Python: ");
        marksPython = scanner.nextInt();
        System.out.print("Enter the marks in C Programming: ");
        marksC = scanner.nextInt();
        System.out.print("Enter the marks in Mathematics: ");
        marksMath = scanner.nextInt();
        System.out.print("Enter the marks in Physics: ");
        marksPhysics = scanner.nextInt();
    }

    int calculateTotal() {
        return marksPython + marksC + marksMath + marksPhysics;
    }

    double calculateAggregate() {
        return calculateTotal() / 4.0;
    }
}

class Result extends Student {
    void displayGrade() {
        double aggregate = calculateAggregate();
        System.out.println("Total = " + calculateTotal());
        System.out.println("Aggregate = " + aggregate);

        if (aggregate > 75) {
            System.out.println("DISTINCTION");
        } else if (aggregate >= 60 && aggregate < 75) {
            System.out.println("FIRST DIVISION");
        } else if (aggregate >= 50 && aggregate < 60) {
            System.out.println("SECOND DIVISION");
        } else if (aggregate >= 40 && aggregate < 50) {
            System.out.println("THIRD DIVISION");
        } else {
            System.out.println("FAIL");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Result student1 = new Result();
        student1.inputMarks();
        student1.displayGrade();
        
        Result student2 = new Result();
        student2.marksPython = 73;
        student2.marksC = 78;
        student2.marksMath = 79;
        student2.marksPhysics = 75;
        student2.displayGrade();
        
        // Similarly, you can create objects for other test cases and call displayGrade() method.
    }
}