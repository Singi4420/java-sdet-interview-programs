public class PrimeNumbersInRange
{
	public static void main(Strig[] args)
	{
		int start = 1;
		int end = 20;
		
		for(int num = start; i<=end; num++)
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
				System.out.println(num + " ");
			}
		}
	}
}