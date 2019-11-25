package myfrstproj;

public class Student 
{

	int rollno;
	String name;
	String branch;
	
	public static void main(String[] args)
	{
		Student m1 =  new Student();
		System.out.println("Student Details:");
		System.out.println("\nroll number:");
		m1.rollno= 1;
		m1.name="Suhel";
		m1.branch="MCA";
		System.out.println(m1.rollno);
		System.out.println("student name:");
		System.out.println(m1.name);
		System.out.println("Branch:");
		System.out.println(m1.branch);
		
		Student m2 =  new Student();
		System.out.println("\nroll no:");
		m2.rollno= 2;
		m2.name="Abhi";
		m2.branch="BE CS";
		System.out.println(m2.rollno);
		System.out.println("Studenr name:");
		System.out.println(m2.name);
		System.out.println("Branch:");
		System.out.println(m2.branch);
		
		Student m3 =  new Student();
		System.out.println("\nRoll no");
		m3.rollno= 3;
		m3.name="Rahul";
		m3.branch="BTech";
		System.out.println(m3.rollno);
		System.out.println("student name:");
		System.out.println(m3.name);
		System.out.println("Brnach:");
		System.out.println(m3.branch);
		
		Student m4 =  new Student();
		System.out.println("\nroll no:");
		m4.rollno= 4;
		m4.name="suresh";
		m4.branch="MBA";
		System.out.println(m4.rollno);
		System.out.println("student name:");
		System.out.println(m4.name);
		System.out.println("Branch:");
		System.out.println(m4.branch);
		
	}
	
	
}
