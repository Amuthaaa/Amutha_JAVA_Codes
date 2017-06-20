import java.util.Scanner;
public class CheckVowel {
	public static void main(String []args)
	{ 
	    char ch;
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter a character to check vowel or consonant");
	    ch=s.next().charAt(0);
	    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	    {
	    	System.out.println("character is Vowel");
	    }
	    else
	    {
	    	System.out.println("character is consonant");
	    }
    }
}
