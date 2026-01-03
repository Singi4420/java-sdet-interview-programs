public class OccurenceOfCharacters
{
	public static void main(String[] args)
	{
		String str = "Interview Preparation Java";
		str = str.toLowerCase();
		
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			int count = 0;
			boolean alreadyChecked = false;
			
			if(ch>='a' && ch<='z')
			{
				for(int k =0; k<i; k++)
				{
					if(ch == str.charAt(k))
					{
						alreadyChecked = true;
						break;
					}
				}
				
				if(alreadyChecked)
				{
					continue;
				}
				
				for(int j=0; j<str.length(); j++)
				{
					if(ch == str.charAt(j))
					{
						count++;
					}
				}
				
				System.out.println(ch + " -> " + count);
			}
			
			
		}
	}
}