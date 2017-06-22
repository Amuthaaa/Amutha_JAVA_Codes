import java.util.Scanner;


public class Reverse {
	public static void main(String []args)
	{ 
	    String str,str1;
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the String");
	    str=s.next();
	    int l=str.length();
	    for(int i=l-1;i>=0;i--)
	    {   
	    	System.out.print(str.charAt(i));
	    }
	}
}
