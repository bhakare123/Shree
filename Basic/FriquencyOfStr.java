package Basic;

public class FriquencyOfStr 
{
   public static void main(String[] args) 
   {
      String ss = "ShridFFFhar bhakrae";
     // String s1 = ss.toLowerCase();
      System.out.println(ss);
      
      char ch[] = ss.toCharArray();
      int count[] = new int[ch.length];




      for(int i=0 ; i<ss.length(); i++)
      {
         count[i]=1;
         for(int j=i+1 ; j<ss.length(); j++)
         {
            if(ch[i]==ch[j])
            {
               count[i]++;
               ch[j]='0';
            }
         }
      }


      for(int i=0; i<count.length; i++)
      {
         if(ch[i] != '0')
         {
            System.out.println(ch[i] +" - "+count[i]);
         }
      }




   }
}