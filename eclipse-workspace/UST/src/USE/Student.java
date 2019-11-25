package USE;

public class Student 
{
	String name;
	int USN;
	int age;
	int id;
	String college;
	
	Student(String name,int USN,int age,int id,String college)
	{
		this.name=name;
		this.USN=USN;
		this.age=age;
		this.id=id;
		this.college=college;
		
	}
	
	void display()
	{
		System.out.println("Name of the student = " +name);
		System.out.println("USN of the student = " +USN);
		System.out.println("Age of the student = " +age);
		System.out.println("Student ID is = " +id);
		System.out.println("College name of the student = " +college);
	}
	
	public static void main(String[] args) 
	{
		Student s1 = new Student("Suhel",38,25,01,"GIT");
		s1.display();
		System.out.println("=====================================");
		Student s2 = new Student("Kayum",101,35,02,"Ggogte");
		s2.display();
		System.out.println("=====================================");
		Student s3 = new Student("Fayum",102,26,03,"ITI");
		s3.display();
		System.out.println("=====================================");
		Student s4 = new Student("Saif",103,27,04,"SGBIT");
		s4.display();
		System.out.println("=====================================");
		Student s5 = new Student("KAif",104,21,05,"Shaikh college");
		s5.display();
		System.out.println("=====================================");
		Student s6 = new Student("wahid",105,29,06,"Anjuman college");
		s6.display();
		System.out.println("=====================================");
		Student s7 = new Student("Aijaz",106,26,07,"RPD College");
		s7.display();
		System.out.println("=====================================");
		Student s8 = new Student("Manzoor",107,30,8,"Govt College");
		s8.display();
		System.out.println("=====================================");
		Student s9 = new Student("Najil",108,24,9,"RLS College");
		s9.display();
		System.out.println("=====================================");
		Student s10 = new Student("Mehemud",109,20,10,"Kittle Science College");
		s10.display();
	}
	
}
