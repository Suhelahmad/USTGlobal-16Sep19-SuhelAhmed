
public class TestA 

{
	static int a;
	static {
		a=10;
		System.out.println("static block 1");
	}
	
	void stat()
	{
		System.out.println("stat constructor");
	}
	
	static {
		a=20;
		System.out.println("static block 2");
	}
	
	public static void main(String[] args) {
		TestA t = new TestA();
		TestA t1 = new TestA();
		System.out.println("a value is " +a);	
		t1.stat();
	}
	
}
