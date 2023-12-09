import java.util.*;
class circleconstructor
{
    float pi,radius;
    circle()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter pi");
        pi=s.nextFloat();
        System.out.println("enter radius");
        radius=s.nextFloat();
    }
    void cal()
    {
        float result=pi*radius*radius;
        System.out.println("area of circle is="+result);
    }
}
class rect
{
    public static void main(String args[])
    {
        circle obj=new circle();
        obj.cal();
    }
}