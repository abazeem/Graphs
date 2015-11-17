public class Cycle {
	
	public static void main(String args[])
	{
		Adjacentlist graph = new Adjacentlist(4);
		graph.insert(1, 0);
		graph.insert(2, 1);
		graph.insert(0, 2);
		graph.insert(2, 0);
		graph.insert(3, 2);
		graph.insert(3, 3);
		
		dispCyclic(graph);
	}
	
	public static void dispCyclic(Adjacentlist graph)
	{
		boolean[] visited = new boolean[graph.v];
		boolean[] stk = new boolean[graph.v];
		for(int i = 0;i<graph.v;i++)
		{
			visited[i] = false;
			stk[i] = false;
		}
		for(int i = 0;i<graph.v;i++)
		{
			visited = new boolean[graph.v];
			stk = new boolean[graph.v];
			if(isCyclic(graph,i,visited,stk))
				System.out.print("Cyclic graph");
			else
				System.out.print("Not Cyclic");
		}
	}
	
	public static boolean isCyclic(Adjacentlist graph, int i , boolean[] visited, boolean[] stk)
	{
		if(!visited[i])
		{
			visited[i] = true;
			stk[i] = true;
			Node x = graph.arr[i];
			while(x!=null)
			{
				if(!visited[x.val] && isCyclic(graph,x.val,visited,stk))
					return true;
				else if(stk[x.val])
					return true;
			}
		}
		stk[i]= false;
		return false;
	}
	
}
