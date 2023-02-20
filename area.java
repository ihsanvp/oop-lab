import java.util.*;
class area
{
	void area1(double r)
	{
		System.out.println("area of circle is "+3.14*r*r);
	}
	void area1(int l,int b)
	{
		System.out.println("area of rectancle is"+l*b);
	}
	double area1(double breadth,double height)
	{
		double result;
		result=0.5*breadth*height;
		return result;
	}

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		area ob1=new area();
		System.out.println("choose the shape");
		System.out.println("1.circle 2.rectangle 3.triangle");
		int ch=s.nextInt();
		switch(ch)
		{
			case 1:
			{
				System.out.println("enter the radius of the cicle");
				double r=s.nextDouble();
				ob1.area1(r);
				break;
			}
			case 2:
			{
				System.out.println("enter the dimensions of triangle");
				int l=s.nextInt();
				int b=s.nextInt();
				ob1.area1(l,b);
				break;
			}
			case 3:
			{
				System.out.println("enter the dimensions of triangles");
				double breadth=s.nextDouble();
				double height=s.nextDouble();
				double result=ob1.area1(breadth,height);
				System.out.println("area of triangle is"+result);
				break;
			}
			default:
			System.out.println("sorry invalid option!!");
		
		}
	}
}

