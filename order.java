import java.util.*;
class order
{
public static void main(String[] Args)
{
Scanner s=new Scanner(System.in);
int n;
System.out.println("enter size :");
n=s.nextInt();
String names[],temp;
names=new String[n];
System.out.println("enter names:");
for(int i=0;i<n;i++)
{
names[i]=s.next();
}
for(int i = 0 ;i<n;i++){
                    for(int j = i+1 ; j<n;j++){
                        if(names[i].compareTo(names[j]) > 0){
temp = names[i];
                            names[i] = names[j];
                            names[j] = temp;
                        }
                    }
                }
System.out.println("Names in Ascending Order : ");
                for(int i = 0;i<n;i++){
                    System.out.println(names[i]);
                }
}
}
