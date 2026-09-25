import java.util.*;
public class RemoveDuplicatesFromArray
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,10,30,20,40};
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int m : arr)
		{
			set.add(m);
		}
		
		System.out.println(set);
	}
}