package ilp;
import java.util.*;
public class Solution44
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String h = sc.nextLine();
		int len= h.length();
		char[] j = h.toCharArray();
		int i=0;
		Map<Character,Integer>map=new HashMap<>();
		while(i!=len)
		{
			if(map.containsKey(j[i])==false)
			{
				map.put(j[i],1);
			}
			else
			{
				int oldvalue = map.get(j[i]);
				int newvalue= oldvalue+1;
				map.put(j[i],newvalue);
			}
			++i;
		}
		Set<Map.Entry<Character,Integer>> hmap=map.entrySet();
		for(Map.Entry<Character,Integer> Data : hmap)
		{
			if(Data.getValue()>1)
			{
				System.out.println(Data.getKey());
			}
		}
		
	}

}
