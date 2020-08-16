package Day5;

import java.util.Scanner;

public class LeaderJava
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
		int count=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				count+=arr[i];
				System.out.println(arr[i]);
			}
		}
		System.out.println(count+arr[arr.length-1]);
	}
}
