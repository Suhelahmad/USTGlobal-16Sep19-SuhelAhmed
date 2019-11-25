package myfrstproj;

public class Bike 
{
	String name;
	int number;
	String Model;
	String color;

	Bike(String a, int b, String c, String d)
	{
		this.name=a;
		this.number=b;
		this.Model=c;
		this.color=d;
	}

	public static void main(String[] args) 
	{
		Bike b = new Bike("Karizma R", 2428 ,"Hero","Gray");
		System.out.println("1) BikeName: " + b.name );
		System.out.println("2) Number: " + b.number );
		System.out.println("3) Model: " + b.Model );
		System.out.println("4) Color: " + b.color );

	}
}
