package ilp;
import java.util.*;
public class Solution34
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String h = sc.nextLine();
		int len = h.length();
		int temp=0;
		String[] y = new String[len*(len+1)/2];
		for(int i=0;i<len;i++)
		{
			for(int j=i;j<len;j++)
			{
				y[temp]=h.substring(i,j+1);
				temp++;
			}
		}
		for(int i=0;i<y.length;i++)
		{
			System.out.println(y[i]);
		}
	}

}
