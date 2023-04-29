package ilp;
import java.util.*;
public class Solution11
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String f = sc.nextLine();
		String[] h = {"a","e","i","o","u"};
		for(int i=0;i<f.length();i++)
		{
			
		if(f.contains(h[i]))
				{
		           System.out.println(h[i]);
		           break;
				}
		}
	}

}
