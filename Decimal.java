import java.util.Scanner;
public class Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] b = new int[10];
        int[] o = new int[10];
        int d1, d2;
        System.out.println("Enter a decimal number:");
        if (sc.hasNextInt()) {
            d1 = sc.nextInt();
            d2 = d1;
            int m = 0, n = 0;
            while (d1 > 0) 
            {
                b[m++] = d1 % 2;
                d1 = d1 / 2;
            }
            System.out.print("Binary Number = ");
            for (int i = m - 1; i >= 0; i--) {
                System.out.print(b[i]);
            }
            while (d2 > 0) {
                o[n++] = d2 % 8;
                d2 = d2 / 8;
            }
            System.out.print("\nOctal = ");
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(o[i]);
            }
        } 

    }
}