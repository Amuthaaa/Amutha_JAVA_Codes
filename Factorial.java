import java.util.Scanner;
public class Factorial {
	public static void main(String []args)
	{ 
	    int num,f=1,i;
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the number to find factorial");
	    num=s.nextInt();
	    if(num==0)
	    {
	    	System.out.println("The factorial of the number "+f+" ");
	    }
	    for(i=1;i<=num;i++)
	    {
	    	f=f*i;
	    }
	    System.out.println("The factorial of the number is "+f+" "); 
	}
}
