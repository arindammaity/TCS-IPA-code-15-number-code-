package ilp;
import java.util.*;
public class Solution26
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String b = sc.nextLine();
		char t = sc.next().charAt(0);
		int len = b.length();
		int count=0;
		for(int i=0;i<len;i++)
		{
			char y = b.charAt(i);
			if(y==t)
			{
				b = b.replaceFirst(String.valueOf(y),String.valueOf(count));
				count++;
			}
			
		}
		System.out.println(b);
	}

}
