package ilp;
import java.util.*;
public class Solution45 
{
	public static  void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String h = sc.nextLine();
		int length = h.length();
		char[] p = h.toCharArray();
		Map<Character,Integer>map = new LinkedHashMap<>();
		int i=0;
		while(i!=length)
		{
			if(map.containsKey(p[i])==false)
			{
				map.put(p[i],1);
			}
			else
			{
				int oldvalue = map.get(p[i]);
				int newvalue = oldvalue+1;
				map.put(p[i],newvalue);
			}
			++i;
		}
		Set<Map.Entry<Character,Integer>> lhmap=map.entrySet();
		String rev ="";
		for(Map.Entry<Character,Integer> Data : lhmap)
		{
			rev = rev+Data.getKey();
		}
		System.out.println(rev);
	}
}
