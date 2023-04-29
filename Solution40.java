package ilp;
import java.util.*; 
public class Solution40
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String h = sc.nextLine();
		int len= h.length();
		char[] t = h.toCharArray();
		Map<Character,Integer>map=new HashMap<>();
		int i=0;
		while(i!=len)
		{
			if(map.containsKey(t[i])==false)
			{
				map.put(t[i],1);
			}
			else
			{
				int oldvalue = map.get(t[i]);
				int newvalue= oldvalue+1;
				map.put(t[i],newvalue);
			}
			++i;
		}
		Set<Map.Entry<Character,Integer>> hmap = map.entrySet();
		for(Map.Entry<Character,Integer>  Data : hmap)
		{
			System.out.print(Data.getKey());
			System.out.println(Data.getValue());
		
		}
	}
}
