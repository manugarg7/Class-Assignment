import java.util.*;

class Subarray
{
 public static void main(String args[])
 {
   Scanner obj=new Scanner(System.in);
    
   System.out.println("Enter size:");
   int n=obj.nextInt();
  
  
   int a[]=new int[n];
   
   System.out.println("Enter Array:");
   for(int i=0;i<n;i++)
   {
     a[i]=obj.nextInt();
   }
   
   System.out.println("Enter key");
   int key=obj.nextInt();
     n=(n-key)+1;
	 int result=n*(n+1)/2;
	 System.out.println("result :" + result);
 }


}