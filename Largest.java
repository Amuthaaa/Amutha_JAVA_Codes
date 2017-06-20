import java.util.Scanner;
public class Largest {
	public static void main(String []args)
	{ 
	    int firstnum,secondnum,thirdnum;
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter a first number");
	    firstnum=s.nextInt();
	    System.out.println("Enter a second number");
	    secondnum=s.nextInt();
	    System.out.println("Enter a third number");
	    thirdnum=s.nextInt();
	    if(firstnum>secondnum && firstnum>thirdnum)
	    {
	    	System.out.println("the greatest number is "+firstnum+" ");
	    }
	    else if(secondnum>firstnum && secondnum>thirdnum)
	    {
	    	System.out.println("The greatest number is "+secondnum+" ");
	    }
	    else if(thirdnum>firstnum && thirdnum>secondnum)
	    {
	    	System.out.println("The greatest number is "+thirdnum+" ");
	    }
	}	    
	  
}
