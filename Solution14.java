package ilp;
import java.util.*;
public class Solution14
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        String f = sc.nextLine();
        String[] pp = f.split(" ");
        String output="";
        for(String   Data : pp)
        {
        	String rev ="";
        	for(int i=Data.length()-1;i>=0;i--)
        	{
        		 rev = rev + Data.charAt(i);
        	}
        	output=output+rev + " ";
        }
        System.out.println(output); 
	}
	

}
