
public class Stack {

	int cap;
	int[] arr;
	int top;
	
	public Stack( int c )
	{
		cap = c;
		top = -1;
		arr = new int[c];
	}
	
	public void push( int x)
	{
		arr[++top] = x;
	}
	
	public int pop()
	{
		int x = arr[top];
		top--;
		return x;
	}
	
	public boolean isEmpty()
	{
		return ( top == -1);
	}
}
