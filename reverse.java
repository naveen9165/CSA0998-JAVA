import java.util.*;
class reverse{
    public static void main(String args[]){
        Scanner S=new Scanner(System.in);
        int num,rev=0,rem;
        System.out.println("enter a number");
        num=S.nextInt();
        while(num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
          System.out.println("reverse "+rev);
          
    }