import java.util.*;

public class HighestOccuringCharacters
{
	public static void main(String[] args)
	{
		String str = "Happy Birthday";
		str = str.toLowerCase();
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(char ch : str.toCharArray())
		{
			if(ch != ' ')
			{
				map.put(ch, map.getOrDefault(ch,0)+1);
			}
		}
		
		int max = 0;
		
		for(int count : map.values())
		{
			if(count > max)
			{
				max = count;
			}
		}
		
		List<Character> list = new ArrayList<>();
		
		
		for(Map.Entry<Character,Integer> entry : map.entrySet())
		{
			if(entry.getValue() == max)
			{
				list.add(entry.getKey());
			}
		}
		
		System.out.println("The Highest frequency is : " + max );
		System.out.println("Character sharing the highest frequency is : " + list);
	}
}
	 
	 
	 