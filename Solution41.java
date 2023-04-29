package ilp;
import java.util.*;
public class Solution41
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String h =sc.nextLine();
		int len = h.length();
		char[] p = h.toCharArray();
		Map<Character,Integer>map=new HashMap<>();
		int i=0;
		while(i!=len)
		{
			if(map.containsKey(p[i])==false)
			{
				map.put(p[i],1);
			}
			else
			{
				int oldvalue=map.get(p[i]);
				int newvalue=oldvalue+1;
				map.put(p[i],newvalue);
			}
			++i;
		}
		Set<Map.Entry<Character,Integer>> hmap =map.entrySet();
		for(Map.Entry<Character,Integer> Data: hmap)
		{
			if(Data.getValue()>1)
			{
				System.out.println("Does not contain any unique character");
				System.exit(0);
			}
		}
		System.out.println("contain all unique character");
	}

}
