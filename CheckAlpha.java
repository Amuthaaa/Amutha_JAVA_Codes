import java.util.Scanner;
public class CheckAlpha {
	public static void main(String []args)
	{ 
	    char ch;
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter a character to check it is alphabets");
	    ch=s.next().charAt(0);
	    if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
	    {
	    	System.out.println("The given character "+ch+" is an alphabets");
	    }
	    else
	    {
	    	System.out.println("The given character "+ch+" is not an alphabets");
	    }
	}
}

