import java.util.*;
class voting{
    public static void main(String args[]){
        Scanner S=new Scanner(System.in);
        int age;
        System.out.println("enter a age");
        age=S.nextInt();
        if(age>=18)
        System.out.println("eligible for voting");
        else
         System.out.println("not eligible for voting");
    }