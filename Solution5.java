package ilp;
import java.util.*;
public class Solution5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum=0;
		while(a>0)
		{
			int r= a%10;
			sum = sum+r;
			a=a/10;
		}
		if(sum%3==0)
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}
	}

}
