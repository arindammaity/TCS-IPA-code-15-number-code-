package ilp;
import java.util.*;
public class Solution1 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count=0;
		int k=0;
		while(a!=0)
		{
			int r = a%10;
			if(r%2==0)
			{
				count++;
			}
			a=a/10;
		}
		++k;
		if(count==3)
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}
	}

}
