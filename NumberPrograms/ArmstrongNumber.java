public class ArmstrongNumber
{
	public static void main(String[] args)
	{
		 int number = 153;
		 int originalNumber = number;
		 int sum = 0;
		 int digits = String.valueOf(number).length();
		 
		 while(number >0)
		 {
			int digit =  number % 10;
			sum = sum + (int) Math.pow(digit,digits); // pow returns double so cast to int
			number = number / 10;
		 }
		 
		 if(sum == originalNumber)
		 {
			System.out.println("The given number is a Armstrong number");
		 }
		 else
		 {
			System.out.println("The Given number is not a armstrong number");
		 }
	}
}