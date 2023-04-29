package ilp;
import java.util.*;
public class Solution27
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String b = sc.nextLine();
		int length= b.length();
		char g = sc.next().charAt(0);
		char[] p=b.toCharArray();
		String hh ="";
		int i=0;
		while(i!=length)
		{
			if(g!=p[i])
			{
				hh=hh+p[i];
			}
			++i;
		}
		System.out.println(hh);
	}

}
