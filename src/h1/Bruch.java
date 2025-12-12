package h1;

public class Bruch
{
	int zaehler = 10;
	int nenner = 20;
	public Bruch(int zaehler, int nenner) 
	{
		this.zaehler=zaehler;
		this.nenner=nenner;
	}
	private int ggT(int x, int y) 
	{
		if(y==0) 
		{
			return Math.abs(x);
		}
		return ggT(y, x%y);
	}
	public void shorten() 
	{
		int a = ggT(zaehler, nenner);
		this.zaehler = zaehler/a;
		this.nenner = nenner/a;
	}
	public boolean hasSameValueAs(Bruch b)
	{
		this.shorten();
		b.shorten();
		int a = b.zaehler;
		int c = b.nenner;
		int d = this.zaehler;
		int e = this.nenner;
		if(c<0 && a<0) 
		{
			a = Math.abs(a);
			c = Math.abs(c);
		}
		if(d<0 && e<0) 
		{
			d = Math.abs(d);
			e = Math.abs(e);
		}
		if((d<0 || e<0) && (a<0 || c<0)) 
		{
			a = Math.abs(a);
			c = Math.abs(c);
			d = Math.abs(d);
			e = Math.abs(e);
			if(a==d && c==e) 
			{
				return true;
			}
		}
		if(a==d && c==e) 
		{
			return true;
		}
		if(a==0 && d==0) 
		{
			return true;
		}
		return false;
	}
}
