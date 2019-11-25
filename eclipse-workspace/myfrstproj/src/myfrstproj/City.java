package myfrstproj;

public class City 
{

	String CityName;
	long pincode;


@Override
public String toString()
{
	return "CityName:" + " " + this.CityName + " " + "Pincode:/"  + this.pincode + " ";
}

public static void main(String[] args) 
{

     City c = new City();
	 c.CityName="Belgaum";
	 c.pincode=596252;
	 System.out.println(c);

	City d = new City();
	d.CityName="Dharwad";
	d.pincode=646825;
	System.out.println(d);

}
}
