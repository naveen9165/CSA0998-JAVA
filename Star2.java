import java.util.*;
class Star2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i,j;
        for(i=n;i>=0;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
        System.out.println();
        }
    }
}