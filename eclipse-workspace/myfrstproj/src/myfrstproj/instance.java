package myfrstproj;

public class instance 
{
	String drink_type;
	int price;
	String flavour;
	
	public static void main(String[] arg)
	{
		instance m1 =  new instance();
		m1.drink_type="vodka";
		m1.price=120;
		m1.flavour="green apple";
		
		System.out.println(m1.drink_type);
		System.out.println(m1.price);
		System.out.println(m1.flavour);
		
		instance m2 =  new instance();
		m2.drink_type="whisky";
		m2.price=120;
		m2.flavour="odo less";
		
		System.out.println(m2.drink_type);
		System.out.println(m2.price);
		System.out.println(m2.flavour);
		
		instance m3 =  new instance();
		m3.drink_type="beer";
		m3.price=300;
		m3.flavour="mango";
		
		System.out.println(m3.drink_type);
		System.out.println(m3.price);
		System.out.println(m3.flavour);
		
		
		
		
		
		
		
	}

}
