import java.util.*;
class p111
{
 public static void main(String[] args)
 {
 int i, j;
 Scanner s= new Scanner(System.in);
 System.out.println("Enter the no.of.rows:");
 int n = s.nextInt();
 
 for(i=0; i<n; i++)
 {
 for(j=i; j>=0; j--)
 System.out.print(1+" ");
 System.out.print("\n");
 }
 for(i=0; i<(n-1); i++)
 {
 for(j=(n-1); j>i; j--)
 System.out.print(1+" ");
 System.out.print("\n");
 }
 }
}