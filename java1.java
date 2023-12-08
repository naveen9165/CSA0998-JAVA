class java1
{
public static void main(String[] args)
class java1
{
public void display1()
{
System.out.println("this is parent class:");
}
}
class java2 extends java1
{
public void display2()
{
System.out.println("this is child class:");
}
}
class main 
{
public static void main(String[] args)
{
java1 obj1=new java1();
java2 obj2=new java2();
obj1.display1();
obj2.display2();
obj2.display1();
}
}
