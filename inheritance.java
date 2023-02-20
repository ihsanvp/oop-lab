class inheritance
{
	public static void main(String args[])
	{
		officer ob1 = new officer();
		ob1.Name = " SHERIN ";
		ob1.Age = 27;
		ob1.Phone_Number=939565345l;
		ob1.Salary= 25500;
		ob1.Address="Malappuram";
		ob1.specialization="sales";
		System.out.println("officer's name is "+ob1.Name + "\n" + ob1.Name + " 's Age is " +ob1.Age + "\n" +
		ob1.Name +" 's phone number is" + ob1.Phone_Number + "\n" + ob1.Name + " 's Address is " + ob1.Address);
		ob1.printSalary();
		System.out.println(ob1.Name + " 's specialization is " + ob1.specialization);
		System.out.println();
		Manager ob2 =new Manager();
		ob2.Name=" RAM ";
		ob2.Age = 40;
		ob2.Phone_Number=776633553l;
		ob2.Address="kuttipuram";
		ob2.Salary= 39000;
		ob2.Department ="Banking";
		System.out.println("Manager's name is"+ ob2.Name + "\n" + ob2.Name + " 's Age is " +ob2.Age + "\n" +
		ob2.Name + " 's phone number is " + ob2.Phone_Number + "\n" + ob2.Name + "'s Address is " + ob2.Address);
		ob2.printSalary();
		System.out.println(ob2.Name + " 's specialization is " +ob2.Department);
	}
}

class Employee
{
	long Age,Phone_Number,Salary;
	String Name,Address;
	void printSalary()
	{
		System.out.println("Salary of"+Name+" is " +Salary);
	}
}

class officer extends Employee
{
	String specialization;
}
class Manager extends Employee
{
	String Department;
}


