package Basic;

public class RotateStrInRight 
{
   public static void main(String[] args) 
   {
     String s = "abcde";
     char[] ch = s.toCharArray();

     
     int temp = ch[0];

     for(int i=0; i<ch.length-1 ; i++)
     {
        ch[i] = ch[i+1];
     }

      ch[ch.length-1]=(char) temp;
      
      
     /*for(int j =1 ; j<=1; j++)
     {
         char temp = ch[ch.length-1];
    
          for(int i = ch.length-1; i>0; i--)
          {
             ch[i] = ch[i-1];
          }
         ch[0] = temp;

    }*/




     System.out.println(ch);



   }  
}
