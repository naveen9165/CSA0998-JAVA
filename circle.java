class circle
{
protected double area;
private int r;
void get()
{
r=5;
}
void cal()
{
area=3.14*r*r;
}
}
class cylinder extends circle
{
private double volume;
private int h;
void get1()
{
h=5;
}
void cal1()
{
volume=area*h;
}
void display()
{
System.out.println("area of circle"+area);
System.out.println("volume of  cylinder"+volume);
}
class inher
{
public static void main(String args[])
{
cylinder cy=new cylinder();
cy.get();
cy.cal();
cy.get1();
cy.cal1();
cy.display();
}
}
}