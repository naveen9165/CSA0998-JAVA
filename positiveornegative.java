import java.util.*;
class positiveornegative{
    public static void main(String args[]){
        Scanner S=new Scanner(System.in);
        int num;
        System.out.println("enter a number");
        num=S.nextInt();
        if(num>0)
        System.out.println("positive number");
        else if(num==0)
         System.out.println("zero number");
         else
          System.out.println("negative number");
    }
}