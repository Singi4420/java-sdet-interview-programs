import java.util.*;

public class FindDuplicatesFromArray
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,10,30,20,40};
		
		HashSet<Integer> unique = new HashSet<>();
		LinkedHashSet<Integer> duplicate = new LinkedHashSet<>();
		
		for(int m: arr)
		{
			if(!unique.add(m))
			{
				duplicate.add(m);
			}
		}
		
		System.out.println(duplicate);
	}
}