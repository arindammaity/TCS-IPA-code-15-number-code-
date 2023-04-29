package ilp;
import java.util.*;
public class Solution25 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String b= sc.nextLine();
		int len = b.length();
		char max =b.charAt(0);
		char min =b.charAt(0);	
		for(int i=1;i<len;i++)
		{
			char t = b.charAt(i);
			if(t>max)
				max=t;
			if(t<min)
				min=t;
		}
		System.out.println(max);
		System.out.println(min);
		
	}

}
