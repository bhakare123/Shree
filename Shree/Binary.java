package Basic.Shree;
import java.util.*;

public class Binary 
{
    boolean m1(int n)
    {
       while(n!=0)
       {
           if(n%10 >1)
           {
              return false ;
           }
         n= n/10;
        }
      return true;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();

        Binary ss = new Binary();

        System.err.println(ss.m1(n));
 
    }
}
