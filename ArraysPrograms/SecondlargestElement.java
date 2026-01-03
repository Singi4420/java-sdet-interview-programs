public class SecondlargestElement
{
	public static void main(String[] args)
	{
		int a[] = {10,20,40,40,70,5,95,100,1,2,7};
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>largest)
			{
				secondlargest = largest;
				largest = a[i];
			}
			else if (a[i] > secondlargest && a[i]!= largest)
			{
				secondlargest = a[i];
			}
		}
		
		System.out.println("The Second Largest Element is : " + secondlargest );
	}
}