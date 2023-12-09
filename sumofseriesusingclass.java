import java.util.*;
class sumofseriesusingclass
{
    int i,n;
    void sum()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter n value");
        n=s.nextInt();
    }
    void cal()
    {
        int sum=0;
        for(i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum of series="+sum);
    }
}
class rect
{
    public static void main(String args[])
    {
        sumofseries obj=new sumofseries();
        obj.sum();
        obj.cal();
    }
}