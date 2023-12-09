import java.util.*;
class primeornot{
    public static void main(String args[]){
        Scanner S=new Scanner(System.in);
        int num,i,count=0;
        System.out.println("enter a number");7
        num=S.nextInt();
        for(i=1;i<=num;i++)
        if(num%i==0)
        count++;
        if(count==2)
          System.out.println("prime number");
          else
          System.out.println("not prime number");
          
    }
}