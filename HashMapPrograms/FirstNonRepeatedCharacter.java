import java.util.*;
public class FirstNonRepeatedCharacter
{
	public static void main(String[] args)
	{
		String str = "swiss";
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char ch: str.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch,0)+1);
		}
		
		for(Map.Entry<Character,Integer> entry : map.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println("The First Non Repeating character is " + entry.getKey());
				break;
			}
		}
	}
}