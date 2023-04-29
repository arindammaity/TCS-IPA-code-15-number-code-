package ilp;
import java.util.*;
public class Solution2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int len = a.length();
		int count=0;
		for(int i= 0;i<len;i++)
		{
			char t = a.charAt(i);
			if(t>97 && t<122)
			{
				count++;
			}
		}
		if(count!=0)
		{
			System.out.println(count);
		}
		else
		{
			System.out.println("No lowercase character is present");
		}
	}

}
