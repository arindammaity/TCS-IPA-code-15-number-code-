package ilp;
import java.util.*;
public class Solution47
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		String[] B = A.split(" ");
		int count=0;
		for(int i=0;i<B.length;i++)
		{
			if(B[i].charAt(0)=='a'||B[i].charAt(0)=='e'||B[i].charAt(0)=='i'||B[i].charAt(0)=='o'||B[i].charAt(0)=='u'||B[i].charAt(0)=='A'||B[i].charAt(0)=='E'||B[i].charAt(0)=='I'||B[i].charAt(0)=='O'||B[i].charAt(0)=='U')
			{
				count++;
			}
		}
		if(count==0)
		{
		System.out.println("Nothing");
		}
		else
		{
			System.out.println(count);
		}
	}

}
