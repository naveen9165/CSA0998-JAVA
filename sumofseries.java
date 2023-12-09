import java.util.*;
class sumofseries{
    public static void main(String args[]){
        Scanner S=new Scanner(System.in);
        int num,i,sum=0;
        System.out.println("enter a number");
        num=S.nextInt();
        for(i=0;i<num;i++)
        sum=sum+i;
          System.out.println("sum of series "+sum);
    }
}