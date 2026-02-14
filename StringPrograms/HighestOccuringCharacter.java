public clas HighestOccuringCharacter
{
	public static void main(String[] args)
	{
		String str = "Java Selenium Automation";
		str = str.replace(" ","").toLowerCase();
		int n = Str.length();
		int highestCount = 0;
		char highestOccuringCharacter = str.charAt(0);
		
		for(int i=0 ; i<n; i++)
		{
			char ch = str.charAt(i);
			boolean alreadyChecked = false;
			
			for(int j=0; j<i; j++)
			{
				if(ch == str.charAt(j))
				{
					alreadyChecked = true;
					break;
				}
			}
			
			if(alreadyChecked)
			{
				continue;
			}
			
			int count = 0;
			
			for(int k=0; k<n; k++)
			{
				if(ch == str.charAt(j))
				{
					count++;
				}
			}
			
			if(count>highestCount)
			{
				highestCount = count;
				highestOccuringCharacter = ch;
			}
		}
		
		System.out.println("The Highest Occuring character is :" + ch + " "+ highestCount + " "+ "times");
	}
}
