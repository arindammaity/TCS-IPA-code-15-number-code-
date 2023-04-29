package ilp;
import java.util.*;
public class Solution46 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String h = sc.nextLine();
		int length = h.length();
		char[] l = h.toCharArray();
		Map<Character,Integer>map = new LinkedHashMap<>();
		int i=0;
		while(i!=length)
		{
			if(map.containsKey(l[i])==false)
			{
				map.put(l[i],1);
			}
			else
			{
				int newval = map.get(l[i]);
				int oldval = newval+1;
				map.put(l[i],oldval);
			}
			++i;
		}
		Set<Map.Entry<Character,Integer>> lhmap=map.entrySet();
		int maxvalue=0;
		char maxchar =' ';
		for(Map.Entry<Character,Integer> Data:lhmap)
		{
			if(Data.getValue()>maxvalue)
			{
				maxvalue=Data.getValue();
				maxchar =Data.getKey();
			}
		}
		System.out.println(maxchar);
	}

}
