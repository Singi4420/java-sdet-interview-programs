public class CountPrimeNumbersInRange
{
	public static void main(String[] args)
	{
		int start = 1;
		int end = 20;
		int count = 0;
		
		for(int num = start; num<= end; num++)
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
				count++;
			}
		}
		
		System.out.println("The Prime Number count in the give Range of 1 to 20 is : " + count);
	}
}