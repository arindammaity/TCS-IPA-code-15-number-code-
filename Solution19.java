package ilp;
import java.util.*;
public class Solution19
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		int len = x.length();
		char[] p = x.toCharArray();
		for(int i=0;i<len;i++)
		{
			if(i%2!=0)
			{
				System.out.println(p[i]);
			}
		}
	}
			

}
