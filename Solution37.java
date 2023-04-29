package ilp;
import java.util.*;
public class Solution37
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int length=a.length();
		String h ="";
		char ch1 ;
		char ch =0;
		for(int i=0;i<length;i++ )
		{
			char t= a.charAt(i);
			if(t>='a' && t<='z')
			{
				 ch1 =Character.toUpperCase(t);
				 h=h+ch1;
			}
			else if(t>='A' && t<='Z')
			{
				ch1=Character.toLowerCase(t);
				h=h+ch1;
			}
			else
			{
				h=h+ch;
			}
			
		}
		System.out.println(h);
	}

}
