import java.util.*;
public class frequency
{
	public static void main(String args[])
	{
	Scanner Sc=new Scanner(System.in);
	System.out.println(" enter the string");
	String str=Sc.nextLine();
	System.out.println("enter the letter");
	String let=Sc.nextLine();
	int count=0;
	for(int i=0;i<str.length()  ;i++)
	{
		if(str.charAt(i)==let.charAt(0))
		 count++;
        }
 		System.out.println("the frequency of letter is "+count);
	}
}       
	  
