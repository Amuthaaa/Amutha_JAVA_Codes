                                                                                                                                                                                                                       import java.util.Scanner;
public class Repeated {
	public static void main(String []args)
	{
	int num,i,j,c=0,count=0,k=0,d;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number");
    num=s.nextInt();
    int a[]=new int[num];
    int a1[]=new int[num];
    for(i=0;i<num;i++)
    {
    	a[i]=s.nextInt();
    }
    for(i=0;i<num;i++)
    {
    	for(j=i+1;j<num;j++)
    	{
    		
    		if(a[i]==a[j])
    		{
    			a1[k]=a[i];
    			k++;
    		}
    	}
    }
    //System.out.println(k); 
    for(d=0;d<k;d++)
    {
    System.out.println(a[d]);
    }
}
}
