package ilp;
import java.util.*;
public class Solution4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] number = new  int[n];
		for(int i=0;i<n;i++)
		{
			number[i]=sc.nextInt();
		}
		int x = number[5];
		int y = number[6];
		int sum=0;
		int count=0;
		for(int  i=0;i<n;i++)
		{
			if(number[i]>x && number[i]<y)
			{
				sum = sum+number[i];
				count++;
			}
		}
		if(count!=0)
		{
			System.out.println("average is ="+ (sum/count));
		}
	}

}
