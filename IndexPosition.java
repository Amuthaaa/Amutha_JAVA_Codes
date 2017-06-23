import java.util.Scanner;


public class IndexPosition {
	public static void main(String []args)
	{
	int num,i,j,c=0,num1,count=0,temp,u=0,con=0;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number of first array");
    num=s.nextInt();
    int a[]=new int[num];
    for(i=0;i<num;i++)
    {
    	a[i]=s.nextInt();
    }
   for(i=0;i<num;i++)
    {
    	 for(j=i+1;j<num;j++)
    	    {
    		  if(a[i]==a[j])
    		  {
    		    u++;
    			 
    		  }
    	    }
    	 }
    if(num==num-u)
    {
     System.out.println("The given input unique");
     con=1;
    }
    System.out.println(con);
   
   if(con==1)
   {
    for(i=0;i<num;i++)
	 {
    	if(a[i]==i)
    	{
    		System.out.println(a[i]);
    	}
	 }
   }
}
}
