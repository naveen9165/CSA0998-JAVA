import java.util.*;
public class TrianglePattern {
    public static void main(String args[]) {
        int n = 4;

        // Print upper part of the triangle
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("" + i + " ");
            }

            System.out.println();
        }

        // Print lower part of the triangle
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("" + i + " ");
            }

            System.out.println();
        }
    }
}