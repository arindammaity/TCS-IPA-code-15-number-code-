package ilp;
import java.util.*;
public class Solution6 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] number = new int[5];
		for(int i=0;i<5;i++)
		{
			number[i]= sc.nextInt();
		}
		int sum =0;
		for(int i=0;i<5;i++)
		{
			if(number[i]%2!=0)
			{
				sum = sum+number[i];
			}
		}
		if(sum>8 && sum<50)
		{
			System.out.println(sum);
		}
		else
		{
			System.out.println("NA");
		}
	}

}
