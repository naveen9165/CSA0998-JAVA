import java.util.*;
class salary
{
public static void main(String aargs[])
{
try
{
double salary;
double bonus;
Scanner s=new Scanner(System.in);
System.out.println("Enter the grade of an emplloyee:");
char g=s.next().charAt(0);
System.out.println("Enter the salary of an emplloyee:");
salary=s.nextDouble();
if(g=='A'||'a'&& salary>=10000)
{
bonus=0.05;
salary=salary+salary*bonus;
System.out.println("total salary  of an emplloyee:"+salary);
}
if(g=='B'||'b' && salary>=10000)
{
bonus=0.1;
salary=salary+salary*bonus;
System.out.println("total salary  of an emplloyee:"+salary);
}
if(salary<=0)
{
System.out.println("invalid salary");
}
if(g!='A'||'a'&&g!="B"||'b')
{
System.out.println("total salary  of an emplloyee:"+salary);
}
if(salary<10000)
{
salary=salary+salary*0.02;
System.out.println("total salary  of an emplloyee:"+salary);
}
}
catch(Exception e)
        {
           System.out.println("Enter the valid salary of an employee");
         }
    }
}



