import java.util.*;
class temperature{
    public static void main(String args[]){
        Scanner S=new Scanner(System.in);
        float celsius,farhrenheit;
        celsius=S.nextFloat();
        farhrenheit=((celsius*9)/5)+32;
        System.out.println("farhrenheit"+farhrenheit);
    }
}