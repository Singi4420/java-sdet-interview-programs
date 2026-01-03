public class MergeTwoArrays
{

	public static void main(String[] args)
	{
		int a[] = {10,20,30,40};
		int b[] = {50,60,70};
		
		int c[] = new int[a.length + b.length];
		int k = 0;
		
		for(int i=0; i<a.length; i++)
		{
			c[k] = a[i];
			k++;
		}
		
		for(int j=0; j<b.length; j++)
		{
			c[k] = b[j];
			k++;
		}
		
		for(int m : c)
		{
			System.out.print(m + " ");
		}
		
	}


}