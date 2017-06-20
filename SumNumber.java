import java.util.Scanner;
public class SumNumber {
	public static void main(String []args)
	{
		 int num,sum=0;
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter the number to find sum");
		 num=s.nextInt();
		 sum=num*(num+1)/2;
		 System.out.println("the sum is "+sum+" ");
	}
}
