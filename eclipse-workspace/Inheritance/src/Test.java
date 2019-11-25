
class Vehicle 
{

	int price;
	String clr;


	void start()
	{

	}
}

class Car extends Vehicle
{
	void start()
	{
		System.out.println("Push the button and start the car");
		System.out.println("Details");
		System.out.println("price:" + " " + this.price + "  " + "color:" + " " + this.clr);


	}

	void playmusic()
	{
		System.out.println("PLAYMUSIC");
	}
}

class Bike extends Vehicle
{
	void start()
	{


		System.out.println("Kick and Start the BIKE");
		System.out.println("Bike Details");
		System.out.println("price:" + " " + this.price + " " + "color:" + " " + this.clr);

	}
}



public class Test
{

	public static void main(String[] args) 
	{

		Vehicle v1 = new Car(); // Up-castig
		v1.clr="white";
		v1.price=150000;
		v1.start();
		Car c = (Car) v1; //Down casting
		c.playmusic();

		System.out.println("-----------------");


		Vehicle v2 = new Bike();
		v2.clr="black";
		v2.price=20000;
		v2.start();

	}
}
