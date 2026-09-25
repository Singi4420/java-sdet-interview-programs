import java.util.*;
public class HighestOccurringWord
{
	public static void main(String[] args)
	{
		String str = "java selenium java api selenium";
		String[] a = str.split(" ");
		
		HashMap<String,Integer> map = new HashMap<>();
		
		for(String word : a)
		{
			map.put(word, map.getOrDefault(word,0)+1);
		}
		
		int max = 0;
		for(int count : map.values())
		{
			if(count> max)
			{
				max = count;
			}
		}
		
		for(Map.Entry<String,Integer> entry : map.entrySet())
		{
			if(entry.getValue() == max)
			{
				System.out.println("The Highest occuring word is " + entry.getKey() +" "+ entry.getValue() + " times" );
			}
		}
		
	}
}