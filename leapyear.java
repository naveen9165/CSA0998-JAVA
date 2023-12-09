import java.util.*;
class leapyear{
    public static void main(String args[]){
        Scanner S=new Scanner(System.in);
        int year;
        System.out.println("enter a year");
        year=S.nextInt();
        if(((year%4==0)&&(year%100!=0))||(year%400==0))
        System.out.println("leap year");
        else
         System.out.println("not leap year");
    }
}