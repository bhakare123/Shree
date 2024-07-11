package Basic.Shree;

public class space 
{
   public static void main(String[] args) 
   {
      String s = "   S hr r ree ";

      String s3 = s.trim();

      System.out.println(s3);

      String s2 = s.replaceAll("\\s", "");

      System.out.println(s2);
   } 
}
