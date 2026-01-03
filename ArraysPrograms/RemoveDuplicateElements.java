public class RemoveDuplicateElements
{

	public static void main(String[] args)
	{
		int a[] = {10,20,30,10,20,40,50,80,40};
		int n = a.length;
		
		for(int i =0; i<n; i++)
		{
			boolean isDuplicate = false;
			
			for(int j=0; j<i; j++)
			{
				if(a[i]==a[j])
				{
					 isDuplicate = true;
					break;
				}
			}
			
			if(!isDuplicate)
			{
				System.out.print(a[i] + " ");
			}
		}
	}


}