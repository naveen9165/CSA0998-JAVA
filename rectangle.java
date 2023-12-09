import java.util.*;
class rectangle
{
    int height,width;
    void area()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter height");
        height=s.nextInt();
        System.out.println("enter width");
        width=s.nextInt();
    }
    void cal()
    {
        int result=height*width;
        System.out.println("area of rectangle is="+result);
    }
}
class rect
{
    public static void main(String args[])
    {
        rectangle obj=new rectangle();
        obj.area();
        obj.cal();
    }
}