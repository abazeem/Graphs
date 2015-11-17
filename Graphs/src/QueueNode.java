public class QueueNode {
	Node[] arr ;
	int front;
	int back;
	int capacity;
	public QueueNode(int c)
	{
		capacity = c;
		front = -1;
		back = 0;
		arr = new Node[c];
	}
	public void enqueue(Node x)
	{
		if(front <capacity)
		{
			arr[++front] = x;
			return;
		}
		else
			System.out.println("Queue Overflow");
	}
	public Node dequeue()
	{
		if(front<back)
		{
			System.out.println("Queue Empty");
			return null;
		}
		else
		{
			Node x = arr[back];
			back++;
			return x;
		}
	}
	public boolean isEmpty()
	{
		return (front < back);
	}
}
