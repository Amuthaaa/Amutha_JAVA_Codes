import java.util.Scanner;
public class Isometric {
	public static void main(String []args)
	{ 
	    String str,str1;
	    int i,j,flag=0;
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the string1");
	    str=s.next();
	    System.out.println("Enter the string2");
	    str1=s.next();
	    if(str.length()==str1.length())
	    {
	    	for(i=0;i<str.length();i++)
	    	{
	    		for(j=0;j<str.length();j++)
	    		{
	    			if(str.charAt(i)==str.charAt(j))
	    			{
	    				if(str1.charAt(i)==str1.charAt(j))
	    				{
	    					break;
	    				}  
	    				else
	    				{
	    					flag=-1;
	    					
	    				}
	    			}
	    		}
	    	}
	    	if(flag==-1)
	    	{
	    		System.out.println("It is not isomorphic");
	    		
	    	}
	    	else
	    	{
	    		System.out.println("It is isomorphic");
	    	}
	    }
	    //System.out.println("It is not equal in length"); 
	}
	}
