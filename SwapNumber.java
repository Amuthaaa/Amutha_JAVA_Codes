import java.util.Scanner;


public class SwapNumber {
	public static void main(String []args)
	{
		 String str;
		 Scanner s=new Scanner(System.in);
		 //System.out.println("Enter the number to find reverse");
		 str=s.next();
		 int l=str.length();
		 char[] characterArray = new char[l];
		 if(characterArray.length%2==0)
		 {
         for (int i = 0; i < characterArray.length; i++) 
         {
        	 System.out.println(characterArray.length); 
            if (i % 2 == 0 ) 
            {
               characterArray[i+1] = str.charAt(i);

			 }
            else
            {
              characterArray[i-1] = str.charAt(i);
            }
         }
		 }
		 else
		 {
		 int i;
         for ( i = 0; i < characterArray.length-1; i++) 
         {
        	// System.out.println(characterArray.length); 
             if (i % 2 == 0 ) 
             {
                characterArray[i+1] = str.charAt(i);

 			 }
             else
             {
               characterArray[i-1] = str.charAt(i);
             }

		 }
         characterArray[i] =  str.charAt(i);
		 }
		 for (int i = 0; i < characterArray.length; i++)
			 {
				 System.out.print(""+characterArray[i]+""); 
			 }
		 

	}
}
