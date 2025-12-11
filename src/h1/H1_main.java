package h1;

public class H1_main 
{
	public static void main(String[]args) 
	{
		Bruch a = new Bruch(2, 4);
		Bruch b = new Bruch(1,2);
		System.out.println(b.hasSameValueAs(a));
		System.out.println(a.nenner);
	}
}
