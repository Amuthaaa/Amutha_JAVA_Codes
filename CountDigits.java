import java.util.Scanner;
public class CountDigits {
	public static void main(String []args)
	{
	int num,i=0;
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the number to count no of digits");
	 num=s.nextInt();
	 if(num==0)
	 {
		 System.out.println("Number of digits 1 ");
	 }
	 else
	 {
	 while(num != 0)
	 {
	        num /= 10;
	        ++i;
	 }

	 System.out.println("Number of digits "+i+" ");
	}
	}
}
