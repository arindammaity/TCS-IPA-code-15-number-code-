package ilp;
import java.util.*;
public class Solution31
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int j = h*h;
		int sum=0;
		while(j>0)
		{
			int r= j%10;
			sum = sum+r;
			j=j/10;
		}
		if(h==sum)
		{
			System.out.println("Neon number");
		}
		else
		{
			System.out.println("Not a neon number");
		}
	}

}
