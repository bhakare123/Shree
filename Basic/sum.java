package Basic;

public class sum 
{
    static int x = 9;
    static
    {
        x = x-- - --x;
    }
    {
        x=x++ + ++x;
    }


    public static void main(String[] args) 
    {
        System.out.println(x);
    }
}
