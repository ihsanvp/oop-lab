import java.util.*;                 
class palindrome{
	public static void main(String arg[]){
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the string");
	String str= s.nextLine();
	int flag=0,i;
	int len = str.length();
	for(i=0;i<len/2;i++)
	{
		if(str.charAt(i) != str.charAt(len-i-1))
		{
			flag=1;
			break;
		}
	}
	if(flag==0)
	{
		System.out.println("String is a pallindrome");
	}else
	{
		System.out.println("String is not a pallandrome");
	}
     }
}

	
