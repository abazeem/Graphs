public class ToplologicalSorting {

	public static void main(String args[])
	{
		Adjacentlist graph = new Adjacentlist(6);
		graph.insert(0, 5);
		graph.insert(2, 5);
		graph.insert(3, 2);
		graph.insert(1, 3);
		graph.insert(0, 4);
		graph.insert(1, 4);
		sort(graph);
	}
	
	public static void sort( Adjacentlist graph)
	{
		Stack stk = new Stack(graph.arr.length);
		int n = graph.arr.length;
		boolean[] visited = new boolean[n];
		for( int i = 0; i< n; i++)
		{
			if(!visited[i])
				TS(graph.arr[i], stk, graph, visited, i);
		}
		
		while(!stk.isEmpty())
			System.out.println(stk.pop() + " ");
		
	}
	
	public static void TS(Node x,Stack stk, Adjacentlist graph, boolean[] visited, int i)
	{
		if(x == null)
		{
			stk.push(i);
			visited[i] = true;
			return;
		}
		if(!visited[i])
		{
			visited[i] = true;
			
			while(x!= null)
			{
				if(!visited[x.val])
					TS(x, stk,graph,visited, x.val);
				x = x.next;
			}
			stk.push(i);
		}
	}
}
