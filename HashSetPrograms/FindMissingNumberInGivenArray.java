import java.util.*;

public class FindMissingNumberInGivenArray
{
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,5};
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int m : arr)
		{
		    set.add(m);
		}
		
		for(int i=1; i<=5; i++)
		{
			if(set.add(i))
			{
				System.out.println("The missing number in the arrays is : " + i);
				break;
			}
			
		}
		
		
	}
}