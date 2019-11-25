package USE;

public class employee
{
	String name;
	int eid;
	
	public employee(String empname , int empid)
	{
		name = empname;
		eid = empid;
	}
	
	void printDetails()
	{
		System.out.println("Employee name is = " +name);
		System.out.println("Employee id is = " +eid);
		this.sayhello();
	}
	void sayhello() {
		System.out.println("Hello "+name+" wel come to UST");
	}
	public static void main(String[] args) {
		employee e1 = new employee("suhel" , 123);
		e1.printDetails();
		
		employee e2 = new employee("suraja" , 12);
		e2.printDetails();
		
	}
}
