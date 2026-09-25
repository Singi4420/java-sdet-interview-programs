import java.util.*;
public class WordCount
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
		
		System.out.println(map);
		
	}
}