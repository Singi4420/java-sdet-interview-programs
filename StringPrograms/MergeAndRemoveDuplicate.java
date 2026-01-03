public class MergeAndRemoveDuplicate
{
	public static void main(String[] args)
	{
		int a[] = {10,20,30,10,40,20};
		int b[] = {30,40,60};
		int c[] = new int[a.length+b.length];
		int k = 0;
		
		int n = c.length;
		
		for(int i=0; i<a.length; i++)
		{
			c[k]=a[i];
			k++;
		}
		
		for(int j=0; j<b.length; j++)
		{
			c[k]=b[j];
			k++;
		}
		
		
		
		 for(int x=0; x<n; x++)
		 {
			boolean isDuplicate = false;
			
			for(int y=0; y<x; y++)
			{
				if(c[x]==c[y])
				{
					isDuplicate = true;
					break;
				}
			}
			
			if(!isDuplicate)
			{
				System.out.print(c[x] + " ");
			}
		 }
	}
}