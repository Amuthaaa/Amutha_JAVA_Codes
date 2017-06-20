import java.util.Scanner;
public class AddNumber {
	public static void main(String []args)
	{
		 int num,i,sum=0;
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter the number to find sum");
		 num=s.nextInt();
		 for(i=1;i<=num;i++)
		 {
			 sum=sum+i;
		 }
		 System.out.println("sum of the number is "+sum+" "); 
	}
}
