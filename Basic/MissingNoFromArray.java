package Basic;

public class MissingNoFromArray 
{

    void m1(int a)
    {
        System.out.println("m1");
    }
   /* void m1(float b)
    {
        System.out.println("m2");
    } */
    void m1(double a)
    {
        System.out.println("m3");
    }
    public static void main(String[] args) 
    {
        MissingNoFromArray  aa = new MissingNoFromArray ();
        aa.m1(-2.3f);
    }
}
