import java.util.*;

public class CountUniqueCharacters
{
	public static void main(String[] args)
	{
		String s = "BANANA";
		
		HashSet<Character> set = new HashSet<>();
		
		for(char ch: s.toCharArray())
		{
			set.add(ch);
		}
		
		System.out.println("The count of unique characters : "+set.size());
	}
}