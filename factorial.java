import java.util.*;
class factorial{
    public static void main(String args[]){
        Scanner S=new Scanner(System.in);
        int num,i,fact=1;
        System.out.println("enter a number");
        num=S.nextInt();
        for(i=1;i<=num;i++)
        fact=fact*i;
          System.out.println("factorial of number "+fact);
    }
}