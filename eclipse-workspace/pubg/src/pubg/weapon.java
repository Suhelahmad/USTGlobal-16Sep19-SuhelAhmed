package pubg;

class weapon2 
{

	void use()
	{


	}
}

class Gun extends weapon2
{
	void use()
	{
		System.out.println("Gun Shoot");
	}
}
class Bomb extends weapon2
{
	void use()
	{
		System.out.println("Boomb Blast");
	}
}

class Knife extends weapon2
{
	void use()
	{
		System.out.println("kill");
	}
}




public class weapon
{

	public static void main(String[] args) 
	{

		weapon2 v1 = new Gun(); // Up-castig

		v1.use();


		System.out.println("-----------------");

		weapon2 v2 = new Bomb(); // Up-castig

		v2.use();


		weapon2 v3 = new Knife(); // Up-castig

		v3.use();


	}
}

