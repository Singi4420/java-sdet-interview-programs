import java.util.*;
public class FrequencyOfElements
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,10,30,20,10};
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int m : arr)
		{
			map.put(m, map.getOrDefault(m,0)+1);
		}
		
		System.out.println(map);
	}
}