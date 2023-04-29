package ilp;
import java.util.*;
public class Solution32
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int sum=0;
		while(h>0)
		{
			int r = h%10;
			sum = sum+r*r*r;
			h=h/10;
		}
		System.out.println(sum);
	}

}
