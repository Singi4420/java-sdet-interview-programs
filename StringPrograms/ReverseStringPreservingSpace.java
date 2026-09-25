public class ReverseStringPreservingSpace
{
	public static String reversePreservingSpace(String str)
	{
		
		char[] inputArray = str.toCharArray();
		char[] reverseArray = new char[inputArray.length];
		
		for(int i=0; i<inputArray.length; i++)
		{
			if(inputArray[i] == ' ')
			{
				reverseArray[i] = ' ';
			}
		}
		
		int j = inputArray.length-1;
		
		for(int i=0; i<inputArray.length; i++)
		{
			if(inputArray[i] != ' ')
			{
				while(inputArray[j] == ' ')
				{
					j--;
				}
				
				reverseArray[i] = inputArray[j];
				j--;
			}
		}
		
		return new String(reverseArray);
	}
	
	public static void main(String[] args)
	{
		String str = "I Like Mango";
		
		String reverse = reversePreservingSpace(str);
		
		System.out.println("The Original String is : " + str);
		System.out.println("The Reverse String is : " + reverse);
	}
}