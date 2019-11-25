
public class TestA 
{
public static void main(String[] args) 
{
	Student s = new Student();
	s.setID(12);
	s.setName("Ammu");
	s.setRollno(134);
	
	Database d = new Database();
	d.receive(s);
	
}
}
