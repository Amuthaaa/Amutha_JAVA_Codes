import java.util.Scanner;


public class FindUnique1 {
	public static void main(String []args)
	{ 
		int num,i,j,count=0,c=0;
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the number");
	    num=s.nextInt();
	    int a[]=new int[num];
	    for(i=0;i<num;i++)
	    {
	    	a[i]=s.nextInt();
	    }
	    for(i=0;i<num;i++)
	    {
	      if(i!=0&&a[i]==a[i-1])
	      {
	    	  continue;
	      }
	      for(j=i+1;j<num;j++)
	      {
	    	  if(a[i]==a[j])
	    	  {
	    		  break;
	    	  }
	    	  else
	    	  {
	    		  count=1;
	    		  c=i;
	    	  }
	      }
	     
	    if(count==1)
	    {  
	    	break;
	    }
	    }
	    System.out.println(a[c]); 
	}
	    
}
