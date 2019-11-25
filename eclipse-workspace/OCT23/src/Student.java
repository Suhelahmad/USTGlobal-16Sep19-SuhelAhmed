
public class Student 
{
	String Name;
	int rollno;
	final String cname = "GIT";
	final int cid;
	Student(String Name, int rollno, int cid)
	{
		this.Name = Name;
		this.rollno = rollno;
		this.cid = cid;
		
	}
	
	final void printdetails()
	{
		System.out.println("Hi " +Name+ " wel come to " +cname);
	}
	
	final void printdetails(String Name)
	{
		System.out.println("Hi " +Name+ " wel come to " +cname );
	}
}
