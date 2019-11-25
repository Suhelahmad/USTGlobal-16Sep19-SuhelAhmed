package UST;

public class Emp2 {
	String name;
	int eid;
	long AdhaarNo;
	
	Emp2(String name,int eid,long AdhaarNo)
	{
		this.name = name;
		this.eid = eid;
		this.AdhaarNo = AdhaarNo;
		
	}
	
	Emp2(String name,int eid)
	{
		this.name = name;
		this.eid = eid;
		
	}
	
	Emp2(int eid,String name)
	{
		this.name = name;
		this.eid = eid;
		
	}
	
	public static void main(String[] args) {
		
		Emp2 e1 = new Emp2("Suhel" , 111);
		e1.printdetails();
		Emp2 e2 = new Emp2(222,"suraja");
		e1.printdetails();
		Emp2 e3 = new Emp2("Suhel" , 111, 545454545);
		e1.printdetails();
		
		
	}
	
	void printdetails()
	{
		System.out.println("Hi "+name+" wel come to UST");
	}
	
	

}
