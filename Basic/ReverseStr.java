package Basic;

public class ReverseStr 
{
   public static void main(String[] args) 
   {
      // Using For loop 
      
      String s = "Shridhar Sanjay Bhakare";
    
      String rev = "";

      for(int i = s.length()-1; i>=0; i--)
      {
         rev = rev + s.charAt(i);
      }
      System.out.println(rev);


      //Using StringBuffer
      StringBuffer ss = new StringBuffer(s);
      System.out.println(ss.reverse());
   } 
}
