package myfrstproj;

public class Movie 
{

	String moviename;
	String language;
	String director;
	
	Movie()
	{
		System.out.println("calling First Constructor");
	}
	
	Movie(String mname, String lng, String drt)
	{
		this.moviename=mname;
		this.language=lng;
		this.director=drt;
		
	}
	
	public static void main(String[] args) 
	{
	
		Movie m1 = new Movie();
		System.out.println(m1.moviename);
		
		
		Movie m2 = new Movie("Name: DDLJ","Language: Hindi","Director: Karan Johar");
		System.out.println(m2.moviename);
		System.out.println(m2.language);
		System.out.println(m2.director);
		
		
	}
	
}
