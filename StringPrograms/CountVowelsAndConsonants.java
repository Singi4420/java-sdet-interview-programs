public class CountVowelsAndConsonants
{
	public static void main(String[] args)
	{
		String str = "Selenium Automation Testing";
		str = str.toLowerCase();
		int vowels = 0;
		int consonants = 0;
		
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			
			if(ch >='a' && ch <='z')
			{
				if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch=='u')
				{
					 vowels++;
				}
				else
				{
					consonants++;
				}
			}
		}
		
		System.out.println("The Count of vowels in given string is : " + vowels);
		System.out.println("The Count of consonants in given string is : " + consonants);
		
	}
}