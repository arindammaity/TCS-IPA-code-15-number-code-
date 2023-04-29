package ilp;
import java.util.*;
public class Solution12
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String h = sc.nextLine();
		int len = h.length();
		String temp="";
		for(int i=0;i<len;i++)
		{
			if(!temp.contains(Character.toString(h.charAt(i))))
			{
				temp = temp+h.charAt(i);
			}
		}
		System.out.println(temp);
	}

}
