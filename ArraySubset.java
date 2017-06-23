import java.util.Scanner;


public class ArraySubset {
	public static void main(String []args)
	{
	int num,i,j,c=0,num1,count=0;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number of first array");
    num=s.nextInt();
    
    int a[]=new int[num];
    System.out.println("Enter the number of second array");
    num1=s.nextInt();
    int ar[]=new int[num1];
    System.out.println("Enter the elements in first array");
    for(i=0;i<num;i++)
    {
    	a[i]=s.nextInt();
    }
    System.out.println("Enter the elements in second array");
    for(j=0;j<num1;j++)
    {
    	ar[j]=s.nextInt();
    }
    for(i=0;i<num;i++)
    {
    	if(i!=0&&a[i]==a[i-1])
	      {
    		  count++;
	    	  continue;
	      }
    	
    	for(j=0;j<num1;j++)
    	{
    		if(a[i]==ar[j])
    		{
    			count++;
    			
    		}
    		else
    		{
    			continue;
    		}
    	}
    }
    if((count-1)==num||(count) == num)
    {   
    	System.out.println("a1 is a subset of a2");
    }
    else
    {
    	
    	System.out.println("a1 is not a subset of a2");
    }
	}
}
