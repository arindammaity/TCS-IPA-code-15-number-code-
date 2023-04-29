package ilp;
import java.util.*;
public class Solution20
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String h = sc.nextLine();
		String hh = h+" ";
		int len = hh.length();
		char[] t = hh.toCharArray();
		for(int i=0;i<t.length;i++)
		{
			if(t[i]==' ')
			{
				System.out.println(t[i-1]);
			}
		}
	}

}
