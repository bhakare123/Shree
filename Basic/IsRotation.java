package Basic;

public class IsRotation 
{
    
       /*  String str3 = str1 + str1 ;

        System.out.println(str3.indexOf(str2));
       
         if(str1.length() == str2.length() && str3.indexOf(str2) != -1 )
         {
               System.out.println("Yes "+str2+" Is rotation of "+str1);
         }
         else
         {
            System.out.println("No "+str2+" not rotation of "+str1);
         }
            */
    public static void main(String[] args) 
    {

        String str1 = "ABCD";
        String str2 = "CDAB";

        if(isRptation(str1, str2))
        {
            System.out.println("yes it is rotation");
        }
        else
        {
            System.out.println("No it is not rotation");
        }
    }

    public static boolean isRptation(String str1 , String str2)
    {
       return(str1.length() == str2.length() && (str1 + str1).indexOf(str2) != -1);
    }
    
}
