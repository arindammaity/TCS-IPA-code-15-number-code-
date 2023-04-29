package ilp;
import java.util.*;
public class Solution18
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String  a = sc.nextLine();
		int len = a.length();
		char [] p = a.toCharArray();
		p[0]=(char)(p[0]-32);
		int i=1;
		while(i!=len)
		{
			if(p[i]==' ')
			{
				  p[i+1]=(char)(p[i+1]-32);
			}
			++i;
		}
		System.out.println(p);
	}
}
