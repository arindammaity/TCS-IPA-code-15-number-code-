package ilp;
import java.util.*;
public class Solution39
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int len = a.length();
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				for(int k=0;k<len;k++)
				{
					if(i!=j && j!=k && k!=i)
						System.out.println(a.charAt(i)+""+a.charAt(j)+""+a.charAt(k));
				}
			}
		}
	}

}
