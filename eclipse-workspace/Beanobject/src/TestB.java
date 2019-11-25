import java.util.Scanner;
public class TestB 
{
	public static void main(String[] args) 
	{
		System.out.println("Scanner class");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age");
		int age = sc.nextInt();
		System.out.println("Age is" +age);
		
		Scanner c = new Scanner(System.in);
		System.out.println("Are you STudent");
		boolean Student = c.nextBoolean();
		System.out.println(Student);
				
		
	}
}
