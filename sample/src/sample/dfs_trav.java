package sample;

import java.util.Scanner;

public class dfs_trav {
	static int N,D;
	static int visited[],flag[],starting_node[];
	static int adjacency[][];
	static int loop=0;
	void dft(int adjacency[][])
	{
		for(int i=0;i<N;i++)
		{	flag[i]=-1;
		}
		for(int i=0;i<N;i++)
		{	
			
			if(visited[i]==0 && flag[i]==-1)
			{	
				dfs(i);
				flag[i]=1;
				starting_node[i]=i;
			}
			
			}
		}
	
	void dfs(int i)
	{
		int temp=0;
		visited[i]=1;
		flag[i]=0;
		//System.out.print(i);
		for(int j=0;j<N;j++)
		{
			temp=0;
			if(i!=j)
			{
			if(adjacency[i][j] == 1 && flag[j]==0)
			{	
				
				loop=1;
				return;	
			}
			else if( (flag[j] == 1 || flag[j]==-1) && adjacency[i][j]==1)
			{
				if((visited[j]==0) )
				{	
					
					dfs(j);
					flag[j] = 1;
					if(temp==1)
					{
						continue;
					}
				}
				
			}
			
			
		else if(adjacency[i][j]==0)
			temp=1;
		}
			else
				loop=1;
		}
		}
		
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		dfs_trav t=new dfs_trav();
		D=s.nextInt();
		adjacency = new int[N][N];
		int x,y;
		if(D<=N)
		{
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				adjacency[i][j]=0;
			}
		}
		for(int i=0;i<D;i++)
		{
			x=s.nextInt();
			for(int j=1;j<=N;j++)
			{
				if(x==j)
				{
					y=s.nextInt();
					adjacency[j-1][y-1]=1;
				}
				}
				
		
		}
		
		visited=new int[N];
		flag=new int[N];
		starting_node=new int[N];
		
		for(int i=0;i<N;i++)
		{
			visited[i]=0;
			starting_node[i]=-1;
		}
		t.dft(adjacency);
		if(loop==1)
			System.out.println(-1);
		else {
			for(int i=0;i<N;i++)
			{
				if(starting_node[i]!=-1)
					System.out.print((i+1)+" ");
				
			}
			
			
			
		}
		
	}
	
	else
		System.out.print("Please enter valid input(D<=N)");
	
}}
