package Day3;

import java.util.ArrayList;
import java.util.Scanner;

public class JustNextNumber
{
	static Scanner sc;
	public static void main(String args[])
	{
		sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++)
		{
			int n=sc.nextInt();
			int num=0;
			ArrayList<Integer> arr=new ArrayList<>(n);
			for(int i=0;i<n;i++)
				arr.add(sc.nextInt());
			for(int i=n-1;i>0;i--)
			{
				if(arr.get(i)>arr.get(i-1))
				{
					num=i-1;
					break;
				}
			}
			int i=n;
			while(arr.get(--i)!=arr.get(num))
			{
				if(arr.get(i)>arr.get(num))
				{
					int temp=arr.get(num);
					arr.set(num, arr.get(i));
					arr.set(i,temp);
					break;
				}
			}
			for(int j=num+1;j<n;j++)
			{
				for(int z=num+1;z<n-1;z++)
				{
					if(arr.get(z)>arr.get(z+1))
					{
					int temp=arr.get(z);
					arr.set(z, arr.get(z+1));
					arr.set(z+1,temp);
					}
				}
			}
			System.out.print(arr);
		}
	}
}
