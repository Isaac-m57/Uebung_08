package h2;

public class H2_main
{
	public static void main(String[]args) 
	{
		Node a = new Node(1);
		Node b = new Node(2);
		SimpleList i = new SimpleList(a);
		//System.out.println(i.head.value);
		i.append(10);
		//i.append(15);
		//System.out.println(i.insertAfter(10,20));
		i.insertAfter(10,20);
		//System.out.println(i.getLast().value);
		i.delete(20);
		Node c = i.head;
		
		while(c!=null) 
		{
			System.out.println(c.value);
			c = c.next;
		}
	}
}
