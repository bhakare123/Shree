package Basic;
import java.util.Set;
import java.util.HashSet;

public class DuplicatefromArr 
{
    public static void main(String[] args) 
    {
       //String  srr[] = {"Shree", "Digya","Shree","Basva","Digya"};

       int srr[] = {1,2,1,3,4,3,5,6,2};
       
       /* 
       for(int i =0; i<srr.length;i++)
       {
        for(int j =i+1; j<srr.length;j++)
        {
            if(srr[i] == srr[j])
            {
                System.out.println(srr[i]);
            }
        }
       }
        */


       Set<Integer> ss = new HashSet<Integer>();
       for(int s : srr)
       {
        if(ss.add(s) == false)
        {
            System.out.println(s);
        }  
       }
    }
}
