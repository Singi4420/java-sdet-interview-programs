public class PalindromString
{
	public static void main(String[] args)
	{
		String str = "madam";
		String rev = "";
		
		for(int i = str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		if(str.equals(rev))
		{
			System.out.println("The Given String is a palindrom");
		}
		else
		{
			System.out.println("The Given String is not a palindrom");
		}
		
		
	}
}