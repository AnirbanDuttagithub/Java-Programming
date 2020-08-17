import java.util.ArrayList;
import java.util.Scanner;

public class kConcatenation
{
	static Scanner sc;
	public static void main(String args[])
	{
		 sc=new Scanner(System.in);
		    int t=0;
		    t=sc.nextInt();
		    while(t-->0){
		    int n=sc.nextInt();
			int k=sc.nextInt();
			int sum=0;
			ArrayList<Integer> arrayList=new ArrayList<>();
			for(int i=0;i<n;i++)
			{
				arrayList.add(sc.nextInt());
			}
			for(int i=0;i<k;i++)
			{
				for(int j=0;j<n;j++)
				{
					sum+=arrayList.get(j);
				}
			}
			System.out.println(sum);
		    }
	}
}
