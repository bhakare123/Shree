package Basic;

public class MissingNoArr 
{
  public static void main(String[] args) 
  {
     int a[] = {2,4,6,8};
     int sum = 0 ;
     for(int i=0; i<a.length;i++)
     {
        sum = sum + a[i];
     }
     System.out.println(sum);



     int sum1 = 0 ;
     int j = 2;
      while(j<=10)
     {
        sum1 = sum1 + j ;
        j = j+2;
     }
     System.out.println(sum1);

     System.out.println("Missin no. from Array is : "+(sum1 - sum));
  }  
}
