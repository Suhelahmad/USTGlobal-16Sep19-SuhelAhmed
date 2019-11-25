
public class Database 
{
	void receive(Student s)
	{
		System.out.println("Id is " +s.getID());
		System.out.println("Name is" +s.getName());
		System.out.println("Rollno" +s.getrollno());
		System.out.println("=======================");
	}
	
	void save(Employee e)
	{
		System.out.println("Id is" +e.getId());
		System.out.println("name is" +e.getName());
		System.out.println("salary is" +e.getSalary());
		System.out.println("dept is" +e.getDept());
		System.out.println("Designation  is" +e.getDesignation());
		

	}
}
