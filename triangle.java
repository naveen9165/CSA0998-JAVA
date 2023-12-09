class triangle
{
    void area(int height,int width)
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
        obj.area(2,10);
    }
}