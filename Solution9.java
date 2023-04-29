package ilp;
import java.util.*;
public class Solution9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum =0;
		while(number>0)
		{
			int r= number%10;
			sum = sum *10  +r; 
			number=number/10;
		}
		System.out.println(sum);
	}

}
