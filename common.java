import java.util.*;
class common
{
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n1,n2;
System.out.print("enter the size of the array1:- ");
n1=s.nextInt();
int[] arr1=new int[n1];
for(int i=0;i<n1;i++)
{
System.out.println("enter elements"+(i+1)+":");
arr1[i]=s.nextInt();
}
System.out.print("enter the size of the array2:- ");
n2=s.nextInt();
int[] arr2=new int[n2];
for(int i=0;i<n2;i++)
{
System.out.println("enter elements"+(i+1)+":");
arr2[i]=s.nextInt();
}
 System.out.print("Common Elements: ");

        for (int i = 0; i < arr1.length; i++) {
            int commonElement = arr1[i];

            
            for (int j = 0; j < arr2.length; j++) {
                if (commonElement == arr2[j]) {
                    System.out.print(commonElement + " ");
                    break; 
 }
            }
        }
}
}