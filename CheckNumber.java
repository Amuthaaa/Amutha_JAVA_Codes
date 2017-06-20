import java.util.Scanner;
public class CheckNumber
{
  public static void main(String []args)
  {
    int num;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number");
    num=s.nextInt();
    if(num>0)
    {
      System.out.println("It is a positive number");
    }
    else if(num==0)
    {
      System.out.println("It is a zero");
    }
    else if(num<0)
    {
      System.out.println("It is a negative number");
    }
   }
}
