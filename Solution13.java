package ilp;
import java.util.*;
public class Solution13
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String b = sc.nextLine ();
		int len = b.length();
		int count1=0;
		int count2=0;
		for(int i=0;i<len;i++)
		{
			char t = b.charAt(i);
			if(t>='a' && t<='z')
			{
				count1++;
			}
			else if (t>='A' && t<='Z')
			{
				count2++;
			}
		}
		System.out.println(count1);
		System.out.println(count2);
		
	}

}
