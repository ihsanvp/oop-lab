import java.util.*;

class exceptiondemo
{
    public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("DIVISION OF 38\n");	
		System.out.print("ENTER THE DIVIDER : ");	
		int a= s.nextInt();
		
		try{
		exceptiondemo obj=new exceptiondemo();
		obj.divide(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception recatched :"+e);
		}
		finally
		{
			System.out.println("\n\nPROGRAM RUNNED\n-----------");
		}
	}

	void divide(int a)
	{
		try
		{
			int b=38/a;
			System.out.println("RESULT IS :"+b);	
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception occured!throwing");
		throw e;
		}
	}
}