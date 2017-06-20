import java.util.Scanner;
public class CheckNumbers
{
  public static void main(String []args)
  { 
    int num;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number to check odd or even");
    num=s.nextInt();
    if(num%2==0)
    {
       System.out.println("It is even number");
    }
    else
    {
       System.out.println("It is odd number");
    }
  }
} 
