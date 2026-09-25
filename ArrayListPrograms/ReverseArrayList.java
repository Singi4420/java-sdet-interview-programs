import java.util.*;
public class ReverseArrayList
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<>();
		
		list.add("apple");
		list.add("Banana");
		list.add("Orange");
		
		System.out.println(list);
		ArrayList<String> revList = new ArrayList<>();
		
		for(int i=list.size()-1; i>=0; i--)
		{
			revList.add(list.get(i));
		}
		
		System.out.println(revList);
	}
}