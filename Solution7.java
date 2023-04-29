package ilp;
import java.util.*;
public class Solution7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int len = a.length();
		int count1=0;
		int count2=0;
		for(int i=0;i<len;i++)
		{
			char t = a.charAt(i);
			if(t=='a'|| t=='e'|| t=='i'|| t=='o'||t=='u')
			{
				count1++;
			}
			else
			{
				if(t>'a' &&t<'z')
				{
					count2++;
				}
			}
		}
		System.out.println(count1);
		System.out.println(count2);
	}

}
