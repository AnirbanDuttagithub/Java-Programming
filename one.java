package practiceset1;

import java.util.Scanner;

public class one
{
	static Scanner sc;
	public static void main(String args[])
	{
		sc=new Scanner(System.in);
		int nWalls=sc.nextInt();
		int height[]=new int[nWalls];
		for(int index=0;index<nWalls;index++)
		{
			height[index]=sc.nextInt();
		}
		int X=sc.nextInt(),Y=sc.nextInt(),count=0;
		for(int i=0;i<nWalls;i++)
		{
			int tempHeight=height[i];
			while(tempHeight>=0)
			{
				tempHeight=tempHeight-X;
				if(tempHeight<=0)
				{
					count++;
					break;
				}
				tempHeight+=1;
				count++;
			}
		}
		System.out.println(count);
	}
}
