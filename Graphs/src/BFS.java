public class BFS {
	
	public static void main(String args[])
	{
		Adjacentlist graph = new Adjacentlist(4);
		graph.insert(0, 0);
		graph.insert(1, 0);
		graph.insert(2, 0);
		graph.insert(1, 1);
		graph.insert(2, 1);
		graph.insert(2, 2);
		graph.insert(0, 2);
		graph.insert(3, 2);
		graph.insert(3, 3);
		printBFS(graph.arr[2], graph);
		//printDFS(graph.arr[2], graph);
	}
	
	public static void printBFS(Node start, Adjacentlist graph)
	{
		boolean[] visited = new boolean[graph.v];
		for(int i = 0;i<graph.v;i++)
			visited[i] = false;
		visited[start.val] = true;
		QueueNode que = new QueueNode(graph.v);
		que.enqueue(start);
		while(!que.isEmpty())
		{
			start = que.dequeue();
			start = graph.arr[start.val];
			System.out.print(start.val + " ");
			start = start.next;
			while(start != null)
			{
				if(!visited[start.val])
				{
					visited[start.val] = true;
					que.enqueue(start);
				}
				start = start.next;
			}
		}
	}
	
	public static void printDFS(Node start, Adjacentlist graph)
	{
		boolean[] visited = new boolean[graph.v];
		for(int i = 0;i<graph.v;i++)
			visited[i] = false;
		DFSutility(start, graph, visited);
	}
	
	public static void DFSutility(Node start, Adjacentlist graph, boolean[] visited)
	{
		visited[start.val] = true;
		System.out.print(start.val + " ");
		start = graph.arr[start.val];
		start = start.next;
		while(start != null)
		{
			if(!visited[start.val])
				DFSutility(start, graph, visited);
			start = start.next;
		}
		
	}
}
