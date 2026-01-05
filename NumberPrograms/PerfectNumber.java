public class PerfectNumber
{

	// perfect number = sum of its perfect diviser
	public static void main(String[] args)
	{
		int num = 28;
		int sum = 0;
		
		for(int i=1; i<=num/2; i++)
		{
			if(num%i==0)
			{
				sum = sum + i;
			}
		}
		
		if(num = sum)
		{
			System.out.println("The given number is a perfect number");
		}
		else
		{
			System.out.println("The given number is not a perfect number");
		}
	}
}