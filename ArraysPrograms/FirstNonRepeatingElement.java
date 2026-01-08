public class FirstNonRepeatingElementInArray
{
	public static void main(String[] args)
	{
		int a[] = {10, 20, 10, 30, 40, 20 , 30, 60, 70};
		boolean found =  false;
		
		for(int i = 0; i < a.length; i++)
		{
			int count = 0;
			
			for(int j = 0; j <a.length; j++)
			{
				if( a[i] == a[j] )
				{
					count++;
				}
			}
			
			if( count == 1 )
			{
				System.out.println("The first non-repeating element is :" + a[i]);
				found = true;
				break;
			}
		}
		
		if( !found )
		{
			System.out.println("There is no non-repeating element in the array");
		}
	}
}
