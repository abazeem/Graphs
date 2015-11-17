public class MinCashflow {

	public static void main(String args[])
	{
		int[][] a = {{0,2000, 1000},
					 {0 , 0 , 5000},
					 {0 ,  0,  0  }};
		getmincashflow(a);
	}
	
	public static void getmincashflow(int[][] graph)
	{
		int p = graph.length;
		int[] amount =  new int[p];
		for(int P = 0; P<p; P++)
		{
			for(int i = 0; i< p; i++)
			{
				amount[P] += graph[i][P] - graph[P][i];
			}
		}
		mincashutil(amount);
	} 
	
	public static int getMin(int a, int b)
	{
		if( a < b)
			return a;
		else
			return b;
	}
	
	public static void mincashutil(int [] a)
	{
		int maxcredit = getmax(a);
		int maxdebit = getmin(a);
		if( a[maxdebit] == 0 && a[maxcredit] == 0)
			return;
		int min = getMin(a[maxcredit], -a[maxdebit]);
		a[maxcredit] -= min;
		a[maxdebit] += min;
		System.out.println("Person " + maxdebit + " payed " + min + " amount to person " + maxcredit);
		mincashutil(a);	
	}
	
	public static int getmax(int [] a)
	{
		int max = 0;
		for(int i = 1; i<a.length;i++)
		{
			if(a[i] > a[max] )
				max = i;
		}
		return max;
	}
	
	public static int getmin(int [] a)
	{
		int min = 0;
		for(int i = 1; i<a.length;i++)
		{
			if(a[i] < a[min] )
				min = i;
		}
		return min;
	}
}
