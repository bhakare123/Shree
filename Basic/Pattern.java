package Basic;

public class Pattern 
{
    public static void main(String[] args) 
    {
        int n = 6;
        int i,j ;
        for(i=n; i>=3; i--)
        {
           for(j=3; j<i; j++)
           {
              System.out.print(i+"*");
           }
        System.out.println(i);
        }
       for(i=3; i<=n; i++)
       {
           for(j=3; j<i; j++)
           {
              System.out.print(i+"*");
           }
        System.out.println(i);
       } 
    }
}
