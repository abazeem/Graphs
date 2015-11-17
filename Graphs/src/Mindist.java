
public class Mindist {

	public static void main(String args[])
	{
		int[][] M = {{0,4,8,0},
					{0,0,0,5},
					{0,0,0,2},
					{0,0,0,0}};
		int v = M.length;
		
		int[] dist = new int[v];
		for(int i = 0; i< v; i++)
			dist[i] = 1000;
		int s =0;
		dist[s] = 0;
		printmindis(M, dist);
	}
	
	public static void printmindis(int[][] M, int[] dist)
	{
		boolean [] set = new boolean[M.length];
		int V = M.length;
		for(int count = 0; count<V; count++)
		{
			int u = getmin(dist, set);
			set[u] = true;
			for(int j = 0; j < V; j++)
			{
				if(M[u][j] != 0 && (dist[u] + M[u][j] < dist[j]) && dist[u] != 1000 && !set[j])
					dist[j] = dist[u] + M[u][j];
			}
		}
		print(dist);
	}
	
	public static void print(int[] dist)
	{
		for(int i = 0; i< dist.length; i++)
		{
			System.out.println(i + " Vertex distance from source 0 " +  dist[i]);
		}
	}
	
	public static int getmin(int[] dist, boolean[] set)
	{
		int min = 1000;
		int minindex = 0;
		for(int i = 0; i< dist.length; i++)
		{
			if(!set[i] && dist[i] < min )
			{
				min = dist[i];
				minindex = i;
			}
		}
		return minindex;
	}
			
}
