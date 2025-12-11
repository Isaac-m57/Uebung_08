package h2;

public class SimpleList 
{
	Node head;
	public SimpleList(Node head) 
	{
		this.head=head;
	}
	
	
	public Node getFirst()
	{
		return head;
	}
	
	public Node getLast() 
	{
		Node a = head;
		while(a.next!=null) 
		{
			a = a.next;
		}
		return a;
	}
	
	public void append(int newValue) 
	{
		if(head==null) 
		{
			head = new Node(newValue);
		}
		if(this.getFirst()==this.getLast()) 
		{
			head.next = new Node(newValue);
		}
		this.getLast().next= new Node(newValue);
	
	}
	
	public Node findFirst(int value) 
	{
		Node a = head;
		while(a.next!=null) 
		{
			if(a.value==value) 
			{
				return a;
			}
			a.next = a;
		}
		return null;
	}
	
	public boolean insertAfter(int preValue, int newValue)
	{
		Node a; 
		a= findFirst(preValue);
		if(a==null) 
		{
			return false;
		}
		if(a.next==null) 
		{
			append(newValue);			//a.next= new Node(newValue);
			return true;
		}
		Node b = new Node(newValue);
		b.next=a.next;
		a.next = b;
		return true;
	}
	
	public boolean delete(int value) 
	{
		if(findFirst(value)==null) 
		{
			return false;
		}
		Node a = head;
		while(a!=findFirst(value)) 
		{
			a = a.next;
		}
		a.next = findFirst(value).next;
		return true;
	}
}
