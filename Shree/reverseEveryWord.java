package Basic.Shree;

public class reverseEveryWord 
{
    public static void main(String[] args) 
    {
        String s = "Shree Bhakre ";
        String ss[] = s.split(" ");
        
        String rr = "";

        for(int i =0 ; i<ss.length; i++)
        {
           String v = ss[i];
           String w ="";
           
           for(int j = ss.length -1; j>=0; j-- )
           {
              w = w + v.charAt(j);
           }
          rr = rr + w ;
        }
        System.out.println(rr);
    }
}
