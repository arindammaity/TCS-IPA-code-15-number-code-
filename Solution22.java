package ilp;
import java.util.*;
public class Solution22
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String h = sc.nextLine();
		String hh = h.replaceAll("[^aeiou]","" );
		System.out.println(hh);
	}

}
