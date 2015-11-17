public class Islands {

	public static void main(String args[])
	{
		int [][] A = {  {1, 1, 0, 0, 0},
		        {0, 1, 0, 0, 1},
		        {1, 0, 0, 1, 1},
		        {0, 0, 0, 0, 0},
		        {1, 0, 1, 0, 1}
		    };
		int x = countislands(A);
		System.out.print(x);
	}
	
	public static boolean isSafe(int R, int C, int i, int j, boolean[][] visited, int[][] M)
	{
		if((i<R && i>= 0 )&& (j<C && j >= 0) && (!visited[i][j] && M[i][j] == 1))
			return true;
		else return false;
	}
	
	public static int countislands(int[][] M)
	{
		int R = M.length;
		int C = M[0].length;
		int count = 0;
		boolean[][] visited = new boolean[R][C];
		for(int i = 0;i<R;i++)
		{
			for(int j = 0; j< C; j++)
			{
				if(M[i][j] == 1 && !visited[i][j] )
					{
						DFS(R, C, i, j, visited, M);
						count++;
					}
			}
		}
		return count;
	}
	public static void DFS(int R, int C, int i, int j, boolean[][] visited, int[][] M)
	{
		int[] row = {-1,-1,-1, 0 ,0,1,1,1 };
		int[] col = {-1, 0,1,-1,1,-1,0,1 };
		visited[i][j] = true;
		for(int k = 0; k< 8; k++)
		{
			if(isSafe(R,C, i + row[k], j+ col[k], visited, M))
				DFS(R,C,i+ row[k],j + col[k], visited, M);
		}
	}
}
