import java.util.*;
class simpleinterestusingclass
{
    int p,r,t;
    void simple()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter amount");
        p=s.nextInt();
        System.out.println("enter rate of interest");
        r=s.nextInt();100
        System.out.println("enter no of Years");
        t=s.nextInt();
    }
    void cal()
    {
        int result=(p*r*t)/100;
        System.out.println("simple interest="+result);
    }
}
class rect
{
    public static void main(String args[])
    {
         simpleinterest obj=new simpleinterest();
         obj.simple();
        obj.cal();
    }
}