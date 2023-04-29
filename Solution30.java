package ilp;
import java.util.*;
public class Solution30
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int s=0;
		for(int i=1;i<h;i++)
		{
			if(h%i==0)
			{
				s=s+i;
			}
		}
		if(s==h)
		{
		System.out.println("Is a perfect number");		
	    }
		else
		{
			System.out.println("not a perfect number");
		}

}
}