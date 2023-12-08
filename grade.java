import java.util.*;
public class grade
{
public static void main(String args[])
{
try
{
float m1,m2,m3,m4,m5,m6;
Scanner s=new Scanner(System.in);
System.out.println("enter marks in python:");
m1=s.nextInt();
System.out.println("enter marks in c program:");
m2=s.nextInt();
System.out.println("enter marks in maths:");
m3=s.nextInt();
System.out.println("enter marks in physics:");
m4=s.nextInt();
System.out.println("enter marks in chemistry:");
m5=s.nextInt();
System.out.println("enter marks in pe:");
m6=s.nextInt();
if(m1>100 || m2>100 || m3>100 || m4>100 || m5>100 || m6>100)
{
                throw new NullPointerException("invalid due to higher values.");
            }
            if (m1 <0  || m2 <0 || m3 <0 || m4 <0 || m5 < 0 || m6 < 0)
            {
                throw new ArithmeticException("invalid due to higher values.");
            }
 float total=m1+m2+m3+m4+m5+m6;
            float agg=total/6;
            System.out.println("TOTAL= " + total);
            System.out.println("Aggregate=" + agg);

            if(agg>75)
            {
                System.out.println("DISTINCTION");
            }
            else if(agg>=60 && agg<75)
            {
                System.out.println("FIRST DIVISION");
            }
            else if(agg>=50 && agg<60)
            {
                System.out.println("SECOND DIVISION");
            }
            else if(agg>=40 && agg<50)
            {
                System.out.println("THIRD DIVISION");
            }
            else
            {
                System.out.println("FAIL");
            }
        }
        catch(NullPointerException e)
        {
            System.out.println("invalid due to higher values.");
        }
        catch(ArithmeticException e)
        {
            System.out.println("invalid due to negative values.");
        }
        catch(Exception e)
        {
            System.out.println("invalid due to floating values.");
        }


    }
}






