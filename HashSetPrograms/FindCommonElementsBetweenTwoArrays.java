import java.util.*;
public class FindCommonElementsBetweenTwoArrays
{
	public static void main(String[] args)
	{
		int arr1[] = {10,20,30,40};
		int arr2[] = {20,40,60,80};
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int m : arr1)
		{
			set.add(m);
		}
		
		System.out.print("The common Elements between Two Arrays are : ");
		
		for(int n : arr2)
		{
			if(set.contains(n))
			{
				System.out.print(" "+ n);
			}
		}
	}
}