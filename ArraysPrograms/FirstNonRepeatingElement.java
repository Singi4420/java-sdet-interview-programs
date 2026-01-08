public class FirstNonRepeatingElementInArray
{
	public static void main(String[] args)
	{
		int a[] = {10, 20, 10, 30, 40, 20 , 30, 60, 70};
		int n = a.length;
		
		for(int i=0; i<n; i++)
		{
			boolean alreadyChecked = false;
			
			for(int j=0; j<i;j++)
			{
				if(a[i]==a[j])
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
				if(a[i] == a[k])
				{
					count++;
				}
			}
			
			if(count == 1)
			{
				System.out.println("The First Non Repeating Element is : " + a[i]);
				break;
			}
		}
		

	}
}
