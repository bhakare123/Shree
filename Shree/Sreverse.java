package Basic.Shree;

public class Sreverse 
{
    public static void main(String[] args) 
    {
        String ss = "ABa";
        String rr = "";

        for(int i= ss.length()-1; i>=0; i--)
        {
               rr = rr + ss.charAt(i);
        }

        System.out.println(rr);

        if(ss.equals(rr))
           System.out.println("yes it is Palindrome ");
        else
           System.out.println("not Palindrome");
    }
}
