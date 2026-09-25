import java.util.*;
public class CheckedAnagaramOrNot
{
	public static void main(String[] args)
	{
		String str1="listen";
		String str2="silent";
		
		HashMap<Character,Integer> map1 = new HashMap<>();
		HashMap<Character,Integer> map2 = new HashMap<>();
		
		for(char ch1 : str1.toCharArray())
		{
			map1.put(ch1, map1.getOrDefault(ch1,0)+1);
		}
		
		for(char ch2 : str2.toCharArray())
		{
			map2.put(ch2, map2.getOrDefault(ch2,0)+1);
		}
		
		if(map1.equals(map2))
		{
			System.out.println("The Given two string are anagram");
		}
		else
		{
			System.out.println("The Given two string are not anagram");
		}
	}
}