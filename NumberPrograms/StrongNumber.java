public class StrongNumber
{
	
	//Strong number = sum of the factorial of its digits
	public static void main(String[] args)
	{
		int num = 145;
		int originalNumber = num;
		int sum = 0;
		
		while(num > 0)
		{
			int digit = num % 10;
			int factorial = 1;
			
			for(int i=1; i<= digit ; i++)
			{
				factorial = factorial * i;
			}
			
			sum = sum + factorial;
			num = num /10;
		}
		
		if( sum == originalNumber)
		{
			System.out.println("The Given number is a strong number");
		}
		else
		{
			System.out.println("The Given number is not a strong number");
		}
		
		    
		
	}
}