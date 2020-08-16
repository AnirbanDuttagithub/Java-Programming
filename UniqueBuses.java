import java.util.*;

public class UniqueBuses 
{
	static Scanner sc;
	public static void main(String args[])
	{
		sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nBuses[]=new int [n+1];
		nBuses[0]=0;
		for(int i=1;i<=n;i++)
		{
			nBuses[i]=sc.nextInt();
		}
		int[] n2Buses=nBuses;
		for(int i=1;i<n;i++)
		{
			for(int j=i;j<=n;j+=i)
			{
				if(j==i)
					continue;
				n2Buses[j]=n2Buses[j]-nBuses[i];
			}
		}
		for(int j=1;j<=n;j++)
		{
			System.out.print(n2Buses[j]+" ");
		}
	}
}
