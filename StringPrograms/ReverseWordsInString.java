public class ReverseWordsInString
{
	public static void main(String[] args)
	{
		String str = "SDET Automation Interview";
		
		String [] words = str.split( " " );
		
		
		for(int i=0; i<words.length; i++)
		{
			String word = words[i];
				
				for(int j = word.length()-1; j>=0; j--)
				{
					System.out.print(word.charAt(j));
				}
				
				System.out.print(" ");
		}
	}
}