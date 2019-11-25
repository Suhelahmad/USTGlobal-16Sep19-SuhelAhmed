package encapsulation;

public class account
{
	private long accountnumber;
	private double balance;
	private String name;
	
 public long getaccountnumber()
 {
	 return this.accountnumber;
 }
 
 public double getbalance()
 {
	 return this.balance;
 }
 
 public String getname()
 {
	 return this.name;
 }
 
 public void setaccountnumber(long accountnumber)
 {
	 this.accountnumber=accountnumber;
 }
 
 public void setbalance(double balance)
 {
	 this.balance=balance;
 }
 
 public void setname(String name)
 {
	 this.name=name;
 }
 
public static void main(String[] args) 
{
		account a = new account();
		a.setaccountnumber(1254l);
		long sum = a.getaccountnumber();
		System.out.println(sum);
		
		account b = new account();
		b.setbalance(250000);
		double summ = b.getbalance();
		System.out.println(summ);
		
		account c = new account();
		c.setname("suhel");
		String summm = c.getname();
		System.out.println(summm);
 }
}