package Day2;

import java.util.Scanner;

public class LongNumberPosssibility
{
	static Scanner sc;
	public static void main(String args[])
	{
		sc=new Scanner(System.in);
		int numberBowls=sc.nextInt(),status=0;
		int arr[]=new int[numberBowls];
		for(int index=0;index<numberBowls;index++)
			arr[index]=sc.nextInt();
		for(int index=numberBowls-1;index>=0;index--)
		{
			if(arr[index]<9)
			{
				arr[index]+=1;
				status=index;
				break;
			}
		}
		if(status==0)
			System.out.println(0);
		else
		 System.out.println(status+1);
	}
}
