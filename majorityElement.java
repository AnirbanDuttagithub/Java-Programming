package Day5;

import java.util.ArrayList;
import java.util.Scanner;

public class majorityElement
{
	static Scanner sc;
	public static void main(String args[])
	{
		sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && !list.contains(arr[i]))
				{
					count++;
				}
			}
			if(count>=3)
				list.add(arr[i]);
		}
		System.out.print(list);
	}
}
