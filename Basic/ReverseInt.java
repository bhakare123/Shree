package Basic;

public class ReverseInt 
{
    public static void main(String[] args) 
    {
        //using logic 
         int i = 1234 ;
         int rev = 0;

         while (i != 0)
        {
            rev = rev * 10;
            rev = rev + i%10 ;
            i = i/10 ;
        }
        System.err.println(i);
        System.out.println(rev);


        //using StringBuffer
        int i1 = 12345 ;
        StringBuffer ss = new StringBuffer(String.valueOf(i1));
        System.out.println(ss.reverse());

    }
}
