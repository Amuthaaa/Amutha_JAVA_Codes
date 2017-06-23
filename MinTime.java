import java.util.*;

class MinTime
{

public static void main(String[] args)
{
 
String str,str1,fhr,fmin,fsec,shr,smin,ssec;

 int fhrs,fmins,fsecs,smins,shrs,ssecs,mins=0;

 Scanner s=new Scanner(System.in);
 
 System.out.println("Enter the timings in the format of HH:MM:SS");

 str=s.next();

 str1=s.next();

 StringTokenizer st=new StringTokenizer(str,":");
 
 StringTokenizer st1=new StringTokenizer(str1,":");
  fhr=st.nextToken();
 
 fhrs=Integer.parseInt(fhr);
 
 fmin=st.nextToken();  
 
 fmins=Integer.parseInt(fmin);

 fsec=st.nextToken();  

 fsecs=Integer.parseInt(fsec);
 
 System.out.println(fhrs);
 
 shr=st1.nextToken();
 
 shrs=Integer.parseInt(shr);
 
 smin=st1.nextToken();
 
 smins=Integer.parseInt(smin);
 
 ssec=st1.nextToken();
 
 ssecs=Integer.parseInt(ssec);
 
 int hour=shrs-fhrs;
 
 int min=smins-fmins;
 
 if(fhrs>shrs)

 {
  
  hour=24-fhrs+shrs;
 
 }
 
 if(hour!=0)

 {
   
 mins+=hour*60+min;
 
 } 
// fhr=st.nextToken();  
// fhrs=Integer.parseInt(fhr);
   System.out.println(mins);


}

}

