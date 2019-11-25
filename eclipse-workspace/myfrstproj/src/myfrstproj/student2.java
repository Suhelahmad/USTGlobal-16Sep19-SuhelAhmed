package myfrstproj;

public class student2 
{

	String name;
	double perc;

	@Override
	public String toString()
	{
		return this.name + " " + "Scored" + " " +  this.perc + " " +"%";
	}
	
	public static void main(String[] args) 
	{
	
		student2 c = new student2();
		c.name="gulldo";
		c.perc=99.9;
		System.out.println(c);
		
		student2 d = new student2();
		d.name="raju";
		d.perc=54;
		System.out.println(d);
			
	}
}
