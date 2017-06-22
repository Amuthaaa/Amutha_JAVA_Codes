import java.util.Scanner;


public class StringToInteger {
	public static void main(String []args)
	{ 
	    String str;;
	    Scanner s=new Scanner(System.in);
	    str=s.next();
	    int l=str.length();
	    char[] characterArray = new char[l];
	   
	    for (int i = 0; i < characterArray.length; i++) 
        {
           int a=str.charAt(i);
           System.out.println(a);
        }
	   
	}
}
