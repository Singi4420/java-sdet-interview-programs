public class RemoveDuplicatesFromString
{
	public static void main(String[] args)
	{
		String str = "SDET Automation Interview";
		str = str.toLowerCase();
		
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			int count = 0;
			boolean alreadyChecked = false;
			
			if(ch >= 'a' && ch<= 'z')
			{
				for(int k=0; k<i; k++)
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
				
				System.out.print(ch);
			}
		}
	}
}