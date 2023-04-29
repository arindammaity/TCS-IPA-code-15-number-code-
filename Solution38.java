package ilp;
import java.util.*;
public class Solution38
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		int len= x.length();
		for(int i=65;i<=90;i++)
		{
			for(int j=0;j<len;j++)
			{
				char f = x.charAt(j);
				if(f==(char)i||f==(char)(i+32))
				System.out.println(f);
			}
		}
	}

}