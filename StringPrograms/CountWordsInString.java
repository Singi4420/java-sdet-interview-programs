public class CountWordsInString
{
	public static void main(String[] args)
	{
		String str = "Java Selenium Automation Testing";
		String words[] = str.split(" ");
		
		System.out.print("The count of words in the string is : " + words.length);

	}
}