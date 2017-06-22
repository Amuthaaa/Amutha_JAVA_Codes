import java.util.Scanner;


public class ReverseDigits {
	public static void main(String []args)
	{ 
	    int num,reverse=0;
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the number to find reverse");
	    num=s.nextInt();
	    while( num != 0 )
	      {
	          reverse = reverse * 10;
	          reverse = reverse + num%10;
	          num = num/10;
	      }
	    System.out.println("Reverse of entered number is "+reverse);
	}
}
