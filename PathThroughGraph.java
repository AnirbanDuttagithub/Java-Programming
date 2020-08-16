package TCS;

import java.util.ArrayList;
import java.util.Scanner;

public class PathThroughGraph
{
	static Scanner sc;
	public static void main(String args[])
	{
		sc=new Scanner(System.in);
		int M,N;
		M=sc.nextInt();
		N=sc.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=M;i>=N;i--)
		{
			if(M%i==0)
			{
				if(!arr.contains(i))
				{
					M=i;
					arr.add(i);
				}
			}
		}
		if(arr.contains(N))
		{
			System.out.println(arr.size()-1);
		}
		else
		{
			for(int i=N;i>=1;i--)
			{
				if(N%i==0)
				{
					if(!arr.contains(i))
					{
						N=i;
						arr.add(i);
					}
				}
			}
			System.out.println(arr.size()-1);
		}
	}
}
