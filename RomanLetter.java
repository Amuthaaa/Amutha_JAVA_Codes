import java.util.Scanner;
public class RomanLetter {
	public static void main(String []args)
	{
		int i,l,num=0;
		 String str;
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter the Roman");
		 str=s.next();
		 l=str.length();
		 System.out.println(l);
		  str=str.toUpperCase();
		 System.out.println(str);
		 for(i=0;i<l;i++)
		 {
			 
			 if(str.charAt(i)=='M')
			 {
				 
				 num=num+1000;
			 }
			 else if(str.charAt(i)=='D')
			 {
				 num=num+500;
			 }
			 else if(str.charAt(i)=='C')
			 {
				 num=num+100;
			 }
			 else if(str.charAt(i)=='L')
			 {

				 if(i-1==-1&&str.charAt(i+1)=='X')
				 {
					 num=num+50;
				 }
				 
				 else
				 {
					 num=num+50;
				 }
				 
			 }
			 
			 else if(str.charAt(i)=='V')
			 {
				 
				 if(i-1==-1&&str.charAt(i+1)=='I')
				 {
					 num=num+5;
				 }
				 
				 else
				 {
					 num=num+5;
				 }
			 }
			 else if(str.charAt(i)=='I')
			 {
				 
				 num=num+1;
			 }
			 else if(str.charAt(i)=='X')
			 {
				 if(i-1!=-1&&str.charAt(i-1)=='I')
				 {
					 num=num+8;
				 }
				 
				 else
				 {
					 num=num+10;
				 }
			 }
			  
		 }
		 System.out.println(num); 
		 
	}

	
}
