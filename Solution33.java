package ilp;
import java.util.*;
public class Solution33
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double sur= Math.sqrt(a);
		if((int)sur == sur)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
