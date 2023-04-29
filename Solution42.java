package ilp;
import java.util.*;
public class Solution42
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String  b = sc.nextLine();
		int len = b.length();
		char[] k = b.toCharArray();
		Map<Character,Integer>map=new HashMap<>();
		int i=0;
		while(i!=len)
		{
			if(map.containsKey(k[i])==false)
			{
				map.put(k[i],1);
			}
			else
			{
				int oldvalue = map.get(k[i]);
				int newvalue = oldvalue+1;
				map.put(k[i],newvalue);
			}
			++i;
		}
		Set<Map.Entry<Character,Integer>> hmap=map.entrySet();
		for(Map.Entry<Character,Integer>  Data : hmap)
		{
			if(Data.getValue()==1)
			{
				System.out.println(Data.getKey());
			}
		}
		
	}

}
