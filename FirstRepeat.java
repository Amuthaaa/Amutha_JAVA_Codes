import java.util.Scanner;


public class FirstRepeat {
	public static void main(String []args)
	{
	int num,i,j,c=0,count=0;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number");
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
    			count=1;
    			c=i;
    		}
    		else
    		{
    			break;
    		}
    	}
    }
   
    	System.out.println(a[c]);
    
    }
    
}

