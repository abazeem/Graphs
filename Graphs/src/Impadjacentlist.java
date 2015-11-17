public class Impadjacentlist {
	
	public static void main(String args[])
	{
		Adjacentlist graph = new Adjacentlist(5);
	
		graph.insert(1, 0);
		graph.insert(2, 1);
		graph.insert(1, 2);
		graph.insert(1, 3);
		graph.insert(0, 4);
		graph.insert(4, 0);
		graph.insert(3, 2);
		graph.insert(2, 3);
		disp(graph);
	}
	
	public static void disp(Adjacentlist graph)
	{
		for(int i = 0;i<graph.v;i++)
		{
			Node head = graph.arr[i];
			System.out.print("head ");
			while(head!=null)
			{
				System.out.print(head.val + " ");
				head = head.next;
			}
			System.out.println("");
		}
	}
}
