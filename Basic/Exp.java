package Basic;

public class Exp 
{
    public static void main(String[] args) 
    {
        System.out.println("a");

        try
        {
            System.out.println("b");
            throw new IllegalArgumentException();  
        }
        catch(Exception c)
        {
            System.out.println("c");
        }
        finally
        {
            System.out.println("d");
        }
        System.out.println("e");
    }
}
