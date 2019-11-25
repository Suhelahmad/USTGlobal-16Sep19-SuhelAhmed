package UST;

public class Subclass
{
	String s = "subclass variable";
	
	Subclass()
	{
		super();
		System.out.println("Subclass Construcutor");
	}
	
	void getSData()
	{
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		System.out.println("*****************");
		super.SuperClassMethod();
		
		
	}
}
