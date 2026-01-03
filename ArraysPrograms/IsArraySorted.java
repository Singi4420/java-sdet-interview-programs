public class IsArraySorted
{
	public static void main(String[] args)
	{
		int a[] = {10,20,30,40,50};
		boolean isSorted = true;
		
		for(int i=0; i<a.length-1; i++)
		{
			if(a[i]>a[i+1])
			{
				isSorted = false;
				break;
			}
		}
		
		if(isSorted)
		{
			System.out.println("The given array is sorted");
		}
		else
		{
			System.out.println("The Given is array is not sorted");
		}
	}
}