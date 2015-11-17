public class Adjacentlist {
	
	int v;
	Node[] arr;
	
	public Adjacentlist(int value)
	{
		v = value;
		arr = new Node[value];
	}
	
	public void insert(int val, int src)
	{
		if(arr[src] == null)
			arr[src] = new Node(val);
		else
		{
			Node last = arr[src]; 
			while(last.next!=null)
				last = last.next;
			last.next = new Node(val);
		}
	}
}
