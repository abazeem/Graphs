
public class Queue {	
	int top;
	int[] arr;
	int last;
	int capacity;
	public Queue(int cap)
	{
		capacity = cap;
		arr = new int[cap];
		last = 0;
		top = -1;
	}
	public void push(int x)
	{
		if(top<capacity)
			arr[++top]=x;
		else
			System.out.println("Queue full");
		
	}
	public int pop()
	{
		if(top>=last)
		{
			int x = arr[last];
			last++;
			return x;
		}
		else
			return -1;
	}
	public void disp()
	{
		for(int i = last;i<= top;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	public boolean isFull()
	{
		return(top>=capacity);
	}
	public boolean isEmpty()
	{
		return(top<last);
	}
}
