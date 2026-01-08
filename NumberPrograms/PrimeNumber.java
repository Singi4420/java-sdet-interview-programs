public class PrimeNumber
{
	public static void main(String[] args)
	{
		int num = 34;
		boolean isPrime = true;
		
		if(num<=1)
		{
			isPrime = false;
		}
		else
		{
			for(int i = 2; i<=Math.sqrt(num); i++)
			{
				if(num%i == 0)
				{
					isPrime = false;
					break;
				}
			}
		}
		
		if(isPrime)
		{
			System.out.println("The Given number is a prime number");
		}
		else
		{
			System.out.println("The Given Number is not a prime number");
		}
	}
}
