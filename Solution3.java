package ilp;
import java.util.*;
public class Solution3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		char y = sc.next().charAt(0);
		int count=0;
		for(int i=0;i<x.length();i++)
		{
			
			if(x.charAt(i)==y)
			{
				count++;
				System.out.println(i);
				break;
			}
		}
		if(count==0)
		{
			System.out.println("NA");
		}
	}

}
