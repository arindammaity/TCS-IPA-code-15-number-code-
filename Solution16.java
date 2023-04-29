package ilp;
import java.util.*;
public class Solution16
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[7];
		for(int i=0;i<7;i++)
		{
			numbers[i]= sc.nextInt();
		}
		for(int i=0;i<numbers.length-1;i++)
		{
			for(int j=0;j<numbers.length-i-1;j++)
			{
				if(numbers[j+1]>numbers[j])
				{
					int h= numbers[j+1];
					numbers[j+1]=numbers[j];
					numbers[j]=h;
				}
			}
				
		}
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
		}
	}

}
