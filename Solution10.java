package ilp;
import java.util.*;
public class Solution10
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String b = sc.nextLine();
		String a = b.toLowerCase();
		int len = a.length();
		String rev ="";
		for(int i=len-1;i>=0;i--)
		{
		     rev = rev+a.charAt(i);	
		}
		System.out.println(rev);
	}

}
