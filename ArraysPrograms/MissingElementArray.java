public class MissingElementArray
{
	public static void main(String[] args)
	{
		int a[] = {1,3,4,5};
		int n = a.length+1;
		int expectedSum = n*(n+1)/2;
		int actualSum = 0;
		
		for(int i=0; i<a.length; i++)
		{
			actualSum = actualSum + a[i];
		}
		
		int MissingElemement = expectedSum - actualSum;
		System.out.println("The Missing element is : " + MissingElemement);
	}
}