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
			return;
		}
		if(this.getFirst()==this.getLast()) 
		{
			head.next = new Node(newValue);
			return;
		}
		this.getLast().next= new Node(newValue);
		return;
	
	}
	
	public Node findFirst(int value) 
	{
		Node a = head;
		while(a!=null) 
		{
			if(a.value==value) 
			{
				return a;
			}
			a = a.next;
		}
		return null;
	}
	
	public boolean insertAfter(int preValue, int newValue)
	{
		Node a; 
		a = this.findFirst(preValue);
		if(a==null) 
		{
			return false;
		}
		if(a==this.getLast()) 
		{
			this.append(newValue);
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
		while(a.next!=findFirst(value)) 
		{
			a = a.next;
		}
		a.next = findFirst(value).next;
		return true;
	}
}
