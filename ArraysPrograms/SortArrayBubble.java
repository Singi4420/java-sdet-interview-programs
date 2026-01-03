public class SortArrayBubble {

	
	public static void main(String[] args)
	 {
	 
		
		int a[] = {20,50,10,60,30};
		
		int n = a.length;
		
		System.out.print("The sorted array is : ");
		
		
		for(int i=0; i<n-1; i++)
		  {
			
			for(int j=0; j<n-1; j++)
			 {
				
				if(a[j] > a[j+1])
					{
						int temp = a[j];
						a[j] = a[j+1];
						a[j+1] =temp;
						
					
					}
			 
			 }
		  
		  }
		  
		  for(int m : a)
			{
				System.out.print(m + " ");
			
			}
		  
		  
		
		
		
	 
	 
	 }



}