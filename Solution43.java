package ilp;
import java.util.*;
public class Solution43
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String h= sc.nextLine();
		int length = h.length();
		char[] p =h.toCharArray();
		Map<Character,Integer>map=new HashMap<>();
		int i=0;
		while(i!=length)
		{
			if(map.containsValue(p[i])==false)
			{
				map.put(p[i],1);
			}
			else
			{
				int oldval = map.get(p[i]);
				int  newval = oldval+1;
				map.put(p[i],newval);
			}
			++i;
		}
		Set<Map.Entry<Character,Integer>> hmap=map.entrySet();
		for(Map.Entry<Character,Integer> Data : hmap)
		{
			if(Data.getValue()==1)
			{
				System.out.println(Data.getKey());
				System.exit(0);
			}
		}
	}

}
