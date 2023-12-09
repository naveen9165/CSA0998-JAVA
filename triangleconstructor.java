import java.util.*;
class triangleconstructor
{
    int height,breadth;
    void area()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter height");
        height=s.nextInt();
        System.out.println("enter breadth");
        breadth=s.nextInt();
    }
    void cal()
    {
        int result=(height*breadth)/2;
        System.out.println("area of triangle is="+result);
    }
}
class rect
{
    public static void main(String args[])
    {
        triangle obj=new triangle();
        obj.area();
        obj.cal();
    }
}