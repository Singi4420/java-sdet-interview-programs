public class LargestPrimeNumberInRange
{
	public static void main(String[] args)
	{
		int start  = 1;
		int end  = 50;
		int largest = -1;
		
		for(int num = start; num<=end; num++)
		{
			if(num<=1)
			{
				continue;
			}
			
			boolean isPrime = true;
			
			for(int i =2; i<=Math.sqrt(num); i++)
			{
				if(num % i == 0)
				{
					isPrime = false;
					break;
				}
			}
			
			if(isPrime)
			{
				largest = num;
			}
		}
		
		if(largest != -1)
		{
			System.out.println("The Largest Prime number in the given range is : " + largest);
		}
		else
		{
			System.out.println("There is no prime number in th range");
		}
	}
}