import java.util.*;
class P1223334444333221 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
for(j=n-i;j>=0;j--)
          {

          System.out.print(" ");
}

            for(j=1;j<=i;j++)
            {
                System.out.print(""+i+" ");
            }
        System.out.println();
        }
 for ( i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (j = 1; j <= i; j++) {
                System.out.print("" + i + " ");
            }

            System.out.println();
        }
    }

}    