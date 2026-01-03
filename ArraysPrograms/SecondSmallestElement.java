public class SecondSmallestElement
{
	public static void main(String[] args)
	{
		int a[] = {10,50,100,5,40,3,9};
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		 
		for(int i=0; i<a.length; i++)
		{
			if(a[i]< smallest)
			{
				secondSmallest = smallest;
				smallest = a[i];
			}
			else if(a[i]<secondSmallest && a[i]!=smallest)
			{
				secondSmallest = a[i];
			}
		}
		
		System.out.println("The Second smallest element is :" + secondSmallest );
	}
}