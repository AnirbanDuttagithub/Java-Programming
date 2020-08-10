package Day2;

import java.util.Scanner;

public class JumpingNumbers
{
	static Scanner sc;
	public static void main(String args[])
	{
		sc=new Scanner(System.in);
		int number=sc.nextInt();
		for(int rep=0;rep<number;rep++)
		{
			int count=0;
			String strRep=rep+"";
			for(int j=0;j<strRep.length()-1;j++)
			{
				int first=strRep.charAt(j);
				int Second=strRep.charAt(j+1);
				if(Math.abs(first-Second)==1)
				{
					count++;
				}
			}
			if(count==strRep.length()-1)
				System.out.print(strRep+" ");
		}
	}
}
