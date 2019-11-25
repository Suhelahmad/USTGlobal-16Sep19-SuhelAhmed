
public class UiElement 
{

	void click()
	{
		System.out.println("UI Element Cliked");
	}

	public class CheckBox extends UiElement
	{

		void click()
		{
			System.out.println("Checke/unchekced");
		}
	}


 public static void main(String[] args)
 {
	
	 UiElement c = new UiElement();
	 c.click();
	 CheckBox c2 = new  UiElement();
	 c2.click();
	 
 }
}
 