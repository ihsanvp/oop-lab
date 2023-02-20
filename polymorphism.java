class polymorphism
{
	public static void main(String arg[])
	{
	rectangle ob1 = new rectangle();
	ob1.numberofsides();
	hexagon ob2= new hexagon();
	ob2.numberofsides();
	triangle ob3 = new triangle();
	ob3.numberofsides();
	shape s;
	s=ob1;
	s.numberofsides();
	s=ob2;
	s.numberofsides();
	s=ob3;
	s.numberofsides();
	}
}
abstract class shape
{
	abstract void numberofsides();
}
class rectangle extends shape
{
	void numberofsides()
	{
	System.out.println("Rectangle has 4 sides");
	}
}
class hexagon extends shape
{
	void numberofsides()
	{
	System.out.println("Hexagon has 6 sides");
	}
}
class triangle extends shape
{
	void numberofsides()
	{
	System.out.println("Triangle has 3 sides");
	}
}

