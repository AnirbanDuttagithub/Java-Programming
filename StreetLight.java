package Day3;

import java.util.ArrayList;
import java.util.Scanner;

public class StreetLight
{
	static Scanner sc;
	public static void main(String[] args)
	{
		sc=new Scanner(System.in);
		int nLight=sc.nextInt();
		ArrayList<Integer> start=new ArrayList<Integer>(nLight);
		ArrayList<Integer> end=new ArrayList<Integer>(nLight);
		for(int i=0;i<nLight;i++)
		{
			start.add(sc.nextInt());
			end.add(sc.nextInt());
		}
		for(int i=0;i<nLight-1;i++)
		{
			if(end.get(i)>start.get(i+1))
			{
				start.set(i+1, end.get(i));
			}
		}
		int length=0;
		for(int i=0;i<nLight;i++)
		{
			if(start.get(i)<end.get(i))
			{
				length += end.get(i)-start.get(i);
			}
		}
		System.out.print(length);
	}

}
