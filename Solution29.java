package ilp;
import java.util.*;
public class Solution29
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] number= new int[5];
		for(int i=0;i<5;i++)
		{
			number[i]= sc.nextInt();
		}
		int count1=0;
		int sum1=0;
		int count2=0;
		int sum2=0;
		for(int i=0;i<5;i++)
		{
			if(number[i]%2==0)
			{
				count1++;
				sum1 = sum1+number[i];
			}
			if(number[i]%2!=0)
			{
				count2++;
				sum2=sum2+number[i];
			}
		}
		int avg1=(sum1/count1);
		int avg2=(sum2/count2);
		System.out.println(sum1);
		System.out.println(count1);
		System.out.println(avg1);
		System.out.println(sum2);
		System.out.println(count2);
		System.out.println(avg2);
		
	}

}
