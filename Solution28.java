package ilp;
import java.util.*;
public class Solution28
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String  b = sc.nextLine();
		int len = b.length();
		String rev="";
		for(int i=0;i<len;i++)
		{
			char y = b.charAt(i);
			if(y!='a'&& y!='e'&& y!='i'&& y!='o'&& y!='u')
			{
				y='i';
			}
			rev=rev+y;
		}
		System.out.println(rev);
	}

}
