package ilp;
import java.util.*;
public class Solution36
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int len = a.length();
		char g = sc.next().charAt(0);
		String v = a.replace("e", "*");
		System.out.println(v);
	}

}
