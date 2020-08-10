package practiceset1;

import java.util.Scanner;

public class two
{
	static Scanner sc;
	public static void main(String args[])
	{
		sc=new Scanner(System.in);
		int nInterns=sc.nextInt();
		int password=sc.nextInt();
		int flag=0,prev=0;
		int arr[]=new int[nInterns];
		for(int i=0;i<50;i++)
		{
			if(i==0)
			{
				for(int j=0;j<nInterns;j++)
				{
					arr[j]=j*5000;
				}
			}
			else
			{
				for(int j=0;j<nInterns;j++)
				{
					arr[j]=arr[j]+5000+i;
				}
			}
			for(int j=0;j<nInterns;j++)
			{
				if(arr[j]==password)
				{
					System.out.println(j);
					flag=1;
					break;
				}
			}
			if(flag==1)
				break;
		}
	}
}
