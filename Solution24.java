package ilp;
import java.util.*;
public class Solution24
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String h = sc.nextLine();
		String hh = h.toLowerCase();
		String hhh= hh.replaceAll("[aeiou]", "");
		System.out.println(hhh);
	}

}
